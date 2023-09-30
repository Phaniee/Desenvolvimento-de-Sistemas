<!DOCTYPE html>
<html lang="pt-br">
    <head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script defer src = "js/script.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>Calculo do IMC</title>
    </head>

    <body>
        <?php include 'navbar.php'; ?>

        <div class="row">
            
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center"> <!--div para a foto-->
                <div class="row">
                
                <?php 

                if(!empty($_GET)){
                    if(!empty($_POST["peso"])){

                        $peso = $_POST["peso"];
                        $altura = str_replace(',', '.', $_POST["altura"]);
                
                        // Verifica se os campos foram preenchidos
                        if (!empty($peso) && !empty($altura)) {
                            // Calcula o IMC
                            $imc = $peso / ($altura * $altura);

                            echo '<img src="./img/imc.jpg" class="rounded" alt="tabela do IMC">';
                            echo '<p class="text-center" style="font-family:tahoma;">Seu IMC é: ' .number_format($imc, 2) . "</p>";
                        } 
                        else {
                            echo "<p>Preencha ambos os campos para calcular o IMC.</p>";
                        }
                    }        

                }else{
                    echo '<img src="./img/undraw_Personal_trainer_re_cnua.png" class="rounded" alt="personal trainer">'; 
                }
          
                ?> 
               </div> 
            </div>

           
           
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center "> <!--div para o form-->
                
                <form action="imc.php?resultado=ok" method="post" style="font-family: tahoma;">
                    <h1 class="text-center text-uppercase" style="font-family: Sans Serif; color:black">Cálculo do IMC</h1>
                    <div class="mb-3">
                        <label for="formGroupExampleInput" class="form-label">Peso:</label>
                        <input type="text" class="form-control" name="peso"  placeholder="Insira o seu peso" required>
                    </div>

                    <div class="mb-3">
                        <label for="formGroupExampleInput2" class="form-label">Altura:</label>
                        <input type="text" class="form-control"  name="altura" placeholder="Insira sua altura" required>
                    </div>
                    <div class="col-sm-5 d-flex justify-content-center ">
                        <button type="submit" value="Enviar" class="btn" style="background-color:#27A629;" >Enviar</button>
                    </div>   
                </form>
            </div> 
            <?php include 'footer.php'; ?>

        </div>
        
    </body>
</html>