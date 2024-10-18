provider "kubernetes" {
  config_path = "~/.kube/config"
}

resource "kubernetes_deployment" "java_app" {
  metadata {
    name = "my-java-app"
    labels = {
      app = "my-java-app"
    }
  }

  spec {
    replicas = 2

    selector {
      match_labels = {
        app = "my-java-app"
      }
    }

    template {
      metadata {
        labels = {
          app = "my-java-app"
        }
      }

      spec {
        container {
          image = "arunrameshdoc/my-java-app:latest"
          name  = "my-java-app"
          ports {
            container_port = 8080
          }
        }
      }
    }
  }
}

resource "kubernetes_service" "java_app_service" {
  metadata {
    name = "my-java-app-service"
  }

  spec {
    selector = {
      app = "my-java-app"
    }

    port {
      port        = 8080
      target_port = 8080
    }

    type = "NodePort"
  }
}
