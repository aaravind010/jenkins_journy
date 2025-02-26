# jenkins_journy

* agent: 
        Specifies where the pipeline or a specific stage will run.
* stages: 
        Defines a sequence of stages to be executed.
* steps: 
        Contains the actual commands to be executed within a stage.

---------------------------------------------------------------------------

agent {
    docker { image 'node:16-alpine' }
  }

-- this allow stages to run in alpine docker container , once the steps are completed this docker container will destroy