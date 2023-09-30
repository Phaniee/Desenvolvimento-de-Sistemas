import React,{useState} from 'react';
import {Text,Image,View,TextInput,Button,Alert,StyleSheet} from 'react-native';

//Importe criado para salvar o caminho da imagem e poder aplicar na variavel que não tem valor definido

import imageEtanol from './assets/etanol.png' ;
import imageGasolina from './assets/gasosa.png' ;

//Variavel para receber o caminho da imagem
var image =''

export default function Aplicacao(){

  const [gasolina,setN1] = useState()
  const [etanol,setN2] = useState()
  const [resultado,setResultado] = useState()

  //constante criada para fazer  o calculo da conta de divisão 
  const dividir = ()=>{
    const resultado = parseInt(etanol)/parseInt(gasolina)
    if (resultado<=0.7) {
      image = imageEtanol //variavel que recebe o resultado que importamos no começo
      setResultado(<Text style= {{color:'green'}}>{"O etanol é mais vantajoso"} </Text>)
    } 
    else{
      image = imageGasolina
      setResultado(<Text style= {{color:'red'}}>{"A gasolina é mais vantajosa"}</Text>)
    }
  }

  return(
        <View style={styles.tudo}>
          <View>
            <View Style={styles.nav}>
              <Image style={styles.img1}
                source={require('./assets/trabalhador.png')} 
              />
            </View>
            <Text style={styles.titulo}> Qual vale mais a pena? </Text>
          </View>

          <View style={{margin:15}}>
            <Text style={styles.sub}> Valor do litro da gasolina: </Text>          
            <TextInput              
              style={styles.caixaDeTexto}
              placeholder='Digite aqui o preço da gasolina'
              placeholderTextColor='black'
              autoFocus={true}
              keyboardType={'numeric'}

              onChangeText = {text =>setN1(text)}
            />            
          </View>           

          <View style={{margin:15}}>
            <Text style={styles.sub}> Valor do litro do etanol:  </Text>          
            <TextInput
              style={styles.caixaDeTexto1}
              placeholder='Digite aqui o preço do etanol'
              placeholderTextColor='black'              
              keyboardType={'numeric'}

              onChangeText = {text =>setN2(text)}
            />            
          </View>           

          <View style={styles.buttom}>
            <Button
              title='Enviar'      
              color='#e88a25'
              onPress = {()=>dividir()}
            />
          </View>
          <Text style={styles.resposta}>  {resultado}  </Text>
          <View style={styles.divImg2}>
              
              <Image        
              style={styles.img2}
              source={image}        
            />
          </View>
          
        </View>
  );
}

const styles = StyleSheet.create({

  tudo:{
    backgroundColor:'#efed89',
    height:'100%',
    width:'100%',

  },
  nav:{
    width:'100%',
    backgroundColor:'#e88a25',
  },

  img1: {
    width: 66,
    height: 58
  },

  img2: {
    width: 200,
    height: 200,
  },

  divImg2:{
    paddingTop:10,
    paddingLeft:130,
  },

  titulo:{
    color:'black',
    fontFamily:'tahoma',
    fontSize:30,
    textAlign:'center',
    marginTop:25,
    marginBottom:10
    
  },

  sub:{
    fontFamily:'tahoma',
    fontSize:20,
    paddingBottom:10,

  },

  caixaDeTexto:{
    borderWidth:1,
    borderColor:'#e88a25',
    color:'black',
    borderRadius:40,
    paddingLeft: 25,
    height:60    
  },
  caixaDeTexto1:{
    borderWidth:1,
    borderColor:'#e88a25',
    color:'black',
    borderRadius:40,
    paddingLeft: 25,
    height:60    
  },

  resposta:{
    color:'#fff',
    fontSize:25,
    textAlign:'center',
    marginTop:30
  },
  buttom:{
    margin: 15,
  }

});