<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
        <title>Que triângulo é esse?</title>
    </head>

    <body>
        <div class="row">
        
            <?php include 'navbar.php'; ?>
            
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center"> <!--div para a foto-->
                <div class="row">
                   
                   
                   
                    <?php 
                        if(!empty($_GET)){
                            if (isset($_POST['lado1']) && isset($_POST['lado2']) && isset($_POST['lado3'])) {
                                $lado1 = $_POST['lado1'];
                                $lado2 = $_POST['lado2'];
                                $lado3 = $_POST['lado3'];
                            
                                if ($lado1 == $lado2 && $lado2 == $lado3) {
                                    echo '<img src="./img/Triangulo equilatero.jpg" class="rounded" alt="cara pensando">';
                                } elseif ($lado1 == $lado2 || $lado1 == $lado3 || $lado2 == $lado3) {
                                    echo '<img src="./img/Triangulo isosceles.jpg" class="rounded" alt="cara pensando">';
                                } else {
                                    echo '<img src="./img/Triangulo escaleno.jpg" class="rounded" alt="cara pensando">';
                                }
                            }

                        }else{
                            echo '<img src="./img/cara pensando nos trinagulos.jpg" class="rounded" alt="cara pensando">';
                        }
                        
                                
                    ?> 
                </div>
            </div>

           
           
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center "> <!--div para o form-->
                <div class="container-md">
                    <form class="row g-3" action="triangulo.php?resultado=ok" method="post" style="font-family: tahoma;">
                        <h1 class="text-center text-uppercase" style="font-family: Sans Serif; color:#273238">Digite as Medidas do Triângulo: </h1>
                        <div class="row mb-2">
                            <label for="formGroupExampleInput" class="col-sm-2 col-form-label">Lado 1:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="lado1"  placeholder="Insira o tamanho" required>
                            </div>    
                        </div>

                        <div class="row mb-2">
                            <label for="formGroupExampleInput2" class="col-sm-2 col-form-label">Lado 2:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control"  name="lado2" placeholder="Insira o tamanho" required>
                            </div>   
                        </div>
                        <div class="row mb-2">
                            <label for="formGroupExampleInput2" class="col-sm-2 col-form-label">Lado 3:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control"  name="lado3" placeholder="Insira o tamanho" required>
                            </div>    
                        </div>
                        <div class="col-sm-5 d-flex justify-content-center ">
                            <button type="submit" value="Enviar" class="btn" style="background-color:#92E3AA;" >Enviar</button>
                        </div>   
                    </form>
                </div>    
            </div> 
            <?php include 'footer.php'; ?>
        </div>
        
    </body>
</html>
    
