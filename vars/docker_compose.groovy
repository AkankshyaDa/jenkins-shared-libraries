def call(){
  echo "This is deploy the code"
  sh 'docker compose down && docker compose up -d'
}
