<!DOCTYPE html>
<html lang="pt-br">
    <head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script defer src = "js/script.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>Tabuada PHP</title>
    </head>

    <body>
        <?php include 'navbar.php'; ?>

        <div class="row">
            
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center"> <!--div para a foto-->
                <div class="row">
               
                
                <?php 

                if(!empty($_GET)){
                if(!empty($_POST["numero"])){
                    $numero = $_POST["numero"];
        
                    // Validar se o valor inserido é um número
                    if (is_numeric($numero)) {
                        echo '<h2 class="text-center text-uppercase" style="font-family: Sans Serif; color:#2fc56e">'."Tabuada do numero ".$numero.':</h2>';
                        
                        // Exibir a tabuada em uma tabela
                        echo "<table class='text-center'>";
                        for ($i = 1; $i <= 10; $i++) {
                            $resultado = $numero * $i;
                            echo "<tr><td>$numero x $i = $resultado</td></tr>";
                        }
                        echo "</table>";
                    } else {
                        echo "<p>Por favor, insira um número válido.</p>";
                    }
                }
                }else{
                    echo ' <img id="imagem-imc" src="./img/undraw_Professor_re_mj1s.png" class="rounded" alt="professor">'; 
                }           
                ?> 
               </div> 
            </div>

           
           
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center "> <!--div para o form-->
                
                <form action="tabuada.php?resultado=ok" method="post" style="font-family: tahoma;">
                    <h1 class="text-center text-uppercase" style="font-family: Sans Serif; color:black">Tabuada Automática:</h1>
                    <div class="mb-3">
                        <label for="formGroupExampleInput" class="form-label">Número:</label>
                        <input type="text" class="form-control" name="numero"  placeholder="Insira um numero...">
                    </div>
                    <div class="col-sm-5 d-flex justify-content-center ">
                        <button type="submit" value="Enviar" class="btn" style="background-color:#2fc56e;" >Enviar</button>
                    </div>   
                </form>
            </div> 
            <?php include 'footer.php'; ?>
        </div>
        
    </body>
</html>