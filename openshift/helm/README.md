# Installing Lippia Web on OpenShift using Helm Charts

## Install Helm

+ Download and install [Latest Helm Release](https://github.com/helm/helm/releases/latest) on your computer.
+ Check the Assets right for your OS.
+ Add binaries to your $PATH

## Deploy Lippia Web ( require cluster-admin role )

Declaring our Variables

+ Defines the internal release name, useful to deploy multiple time in the same namespace

  `$ HELM_NAME=lippia-web`

+ Defines the internal namespace or project 

  `$ HELM_NAMESPACE=lippia-web-demo`

### Deploy Helm Chart

`$ helm template --name $HELM_NAME --namespace $HELM_NAMESPACE lippia-web | oc apply -f -`

### Remove Helm Chart

`$ helm template --name $HELM_NAME --namespace $HELM_NAMESPACE -x templates/00-project.yml lippia-web | oc delete -f -`