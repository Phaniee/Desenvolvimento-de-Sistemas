import React, { useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Image, Pressable, Modal, Alert } from 'react-native';

import pedra from './src/assets/pedra.png';
import papel from './src/assets/papel.png';
import tesoura from './src/assets/tesoura.png';

const OPONENTE_OPCAO = [pedra, papel, tesoura];

export default function App() {
  const [modalVisible, setModalVisible] = useState(false);
  const [imagemJogador, setImagemJogador] = useState(null);
  const [imagemOponente, setImagemOponente] = useState(null);
  const [placarJogador, setPlacarJogador] = useState(0);
  const [placarOponente, setPlacarOponente] = useState(0);

  const handlePress = (escolhaJogador) => {
    const escolhaOponente = Math.floor(Math.random() * 3);
    
    setImagemJogador(OPONENTE_OPCAO[escolhaJogador]);
    setImagemOponente(OPONENTE_OPCAO[escolhaOponente]);

    const resultado = calcularResultado(escolhaJogador, escolhaOponente);
    atualizarPlacar(resultado);
  };

  const calcularResultado = (escolhaJogador, escolhaOponente) => {
    if (escolhaJogador === escolhaOponente) {
      return 0; // Empate
    } else if ((escolhaJogador === 0 && escolhaOponente === 2) ||
               (escolhaJogador === 1 && escolhaOponente === 0) ||
               (escolhaJogador === 2 && escolhaOponente === 1)) {
      return 1; // Jogador ganha
    } else {
      return -1; // Jogador perde
    }
  };

  const atualizarPlacar = (resultado) => {
    if (resultado === 1) {
      setPlacarJogador(placarJogador + 1);
    } else if (resultado === -1) {
      setPlacarOponente(placarOponente + 1);
    }
  };

  const resetGame = () => {
    setImagemJogador(null);
    setImagemOponente(null);
    setModalVisible(false);
    setPlacarJogador(0);
    setPlacarOponente(0);
  };

  return (
    <View style={styles.container}>
      <View style={styles.head}>
        <Image style={styles.imgTitulo} source={require('./src/assets/titulo.png')} />
      </View>
       
      <View style={styles.caixaPlacar}>
        <Text style={styles.textPlacar}>Placar</Text>
        <View style={styles.placar}>
          <Text style={styles.textPlacar}>{placarJogador}</Text>
          <Text style={styles.textPlacar}>{placarOponente}</Text>
        </View>
      </View>
      
      <View style={styles.mid}>
        <Image style={styles.img2} source={imagemJogador || require('./src/assets/caixa.png')} />
        <View style={{margin:15}}><Image style={styles.img1} source={require('./src/assets/vs.png')} /></View>
        
        <Image style={styles.img2} source={imagemOponente || require('./src/assets/caixa.png')} />
      </View>

      <Modal
        animationType="slide"
        transparent={true}
        visible={modalVisible}
        onRequestClose={() => {
          Alert.alert('Modal has been closed.');
          setModalVisible(!modalVisible);
        }}>
        <View style={styles.centeredView}>
          <View style={styles.modalView}>
            <Text style={styles.modalText}>Deseja resetar a partida?</Text>
            <View style={styles.modalViewButton}>
              <Pressable
                style={[styles.buttonModal, styles.buttonClose]}
                onPress={() => resetGame()}>
                <Text style={styles.textStyle}>Sim</Text>
              </Pressable>
              <Pressable
                style={[styles.buttonModal, styles.buttonClose]}
                onPress={() => setModalVisible(!modalVisible)}>
                <Text style={styles.textStyle}>Cancelar</Text>
              </Pressable>
            </View>
          </View>
        </View>
      </Modal>

      
      <View style={styles.caixaButton}>
        <Pressable style={styles.button} onPress={() => setModalVisible(true)}>
          <Text style={styles.textButton}>Nova Partida</Text>
        </Pressable>
      </View>

      <View style={styles.footer}>
        <Pressable style={styles.buttonJogo} onPress={() => handlePress(0)}>
          <Image style={styles.img2} source={pedra} />
        </Pressable>
        <Pressable style={styles.buttonJogo} onPress={() => handlePress(2)}>
          <Image style={styles.img2} source={tesoura} />
        </Pressable>
        <Pressable style={styles.buttonJogo} onPress={() => handlePress(1)}>
          <Image style={styles.img2} source={papel} />
        </Pressable>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ffff',
  },
  caixaPlacar: {
    flex: 1,
    justifyContent:'center',
    alignItems: 'center',
  },
  head: {
    flex: 1,
    justifyContent:'center',
    alignItems: 'center',
    margin:7,
  },
  placar: {
    justifyContent:'space-evenly',
    alignItems:'center',
    width:'100%',
    flexDirection:'row',
  },
  textPlacar: {
    fontSize: 30,
  },
  img1: {
    width: 100,
    height: 58,
  },
  imgTitulo: {
    width: '100%',
    height: '55%',
  },
  img2: {
    width: 125,
    height: 105,
  },
  img3: {
    width: 110,
    height: 85,
  },
  caixaButton: {
    alignItems: 'center',
  },
  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 20,
    margin: 10,
    width: 200,
    borderRadius: 8,
    borderWidth: 3,
  },
  buttonJogo: {
    alignItems: 'center',
    padding: 10,
    width: 150,
    borderRadius: 8,
  },
  textButton: {
    fontSize: 20,
  },
  mid: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },
  centeredView: {
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 22,
  },
  modalView: {
    margin: 20,
    backgroundColor: 'white',
    borderRadius: 20,
    padding: 35,
    alignItems: 'center',
    shadowColor: '#000',
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.25,
    shadowRadius: 4,
    elevation: 5,
  },
  modalViewButton:{
    justifyContent:'space-evenly',
    flexDirection:'row',
    paddingn:5,
  },
  buttonModal: {
    borderRadius: 20,
    padding: 10,
    elevation: 2,
    marginVertical: 5,
  },
  buttonClose: {
    backgroundColor: '#2196F3',
  },
  textStyle: {
    color: 'white',
    fontWeight: 'bold',
    textAlign: 'center',
  },
  modalText: {
    marginBottom: 15,
    textAlign: 'center',
  },
  footer: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'space-evenly',
    alignItems: 'center',
  },
});
