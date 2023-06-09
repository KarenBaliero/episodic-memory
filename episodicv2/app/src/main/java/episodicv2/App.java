/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package episodicv2;

import br.unicamp.cst.core.entities.Codelet;
import br.unicamp.cst.core.entities.MemoryObject;
import br.unicamp.cst.core.entities.Mind;
import br.unicamp.cst.io.rest.RESTServer;
import br.unicamp.cst.util.viewer.MindViewer;

public final class App {
    
    Mind m;
    
    private void createAndShowGUI(Mind m) {
        MindViewer mv = new MindViewer(m,"MindViewer",m.getCodeletGroupList("Motor"));
        mv.setVisible(true);
    } 
    
    public Mind prepareMind() {
        m = new Mind();
        //Declare Memory Objects
        MemoryObject imagePerceptedMO;
        MemoryObject requestObjectRelationMO;
        MemoryObject requestObjectMO;
        MemoryObject boxCenterPointsMO;
        MemoryObject recognizedObjectsMO;
        MemoryObject iTCFeaturesMO;
        MemoryObject objectRelationMO;
        MemoryObject retrievedObjectTopDownMO;
        MemoryObject retrieveObjectRelationsMO;
        MemoryObject unintegratedScenePatternMO;
        MemoryObject midTermMemoryObjectRelationsMO;
        MemoryObject pRCProcess3toVLPFC;
        MemoryObject eNCtoDGandCA3;
        MemoryObject eNCtoMPFC;
        MemoryObject requestSomethingMO;
        MemoryObject newEncodedSceneMO;
        MemoryObject cA3toCA3Process;
        MemoryObject sceneMO;
        MemoryObject retrieveSimilarScenesBottomUpMO;
        MemoryObject retrieveSimilarScenesTopDownMO;
        MemoryObject similarScenesTopDownMO;
        MemoryObject similarScenesBottomUpMO;
        MemoryObject sceneStoreMO;
        MemoryObject cA3Process2toCA1;
        MemoryObject retrievedSceneTopDownMO;
        MemoryObject currentSceneMO;
        MemoryObject cA1toCA1Process2andSB;
        MemoryObject retrievedSceneTopDownLTMMO;
        MemoryObject sceneRelationMO;
        MemoryObject sceneIDMO;
        MemoryObject sceneRelationsArrayMO;
        MemoryObject sceneRelationsMO;
        MemoryObject retrievedSceneRelationTopDownMO;
        MemoryObject retrievedSceneRelationTopDownLTMMO;
        MemoryObject midTermMemorySceneRelationsMO;
        MemoryObject dGtoDGProcess;
        MemoryObject sBtoENC;
        
        
        imagePerceptedMO=m.createMemoryObject("IMAGE_PERCEPTED");
        requestObjectRelationMO=m.createMemoryObject("REQUEST_OBJECT_RELATION");
        requestObjectMO=m.createMemoryObject("REQUEST_OBJECT");
        boxCenterPointsMO=m.createMemoryObject("BOX_CENTER_POINTS");
        recognizedObjectsMO=m.createMemoryObject("RECOGNIZED_OBJECTS");
        iTCFeaturesMO=m.createMemoryObject("ITC_FEATURES");
        objectRelationMO=m.createMemoryObject("OBJECT_RELATION");
        retrievedObjectTopDownMO=m.createMemoryObject("RETRIEVED_OBJECT_TOP_DOWN");
        retrieveObjectRelationsMO=m.createMemoryObject("RETRIEVE_OBJECT_RELATIONS");
        unintegratedScenePatternMO=m.createMemoryObject("UNINTEGRATED_SCENE_PATTERN");
        midTermMemoryObjectRelationsMO=m.createMemoryObject("MID_TERM_MEMORY_OBJECT_RELATIONS");
        pRCProcess3toVLPFC=m.createMemoryObject("PRCPROCESS3_TO_VLPFC");
        eNCtoDGandCA3=m.createMemoryObject("ENC_TO_DG_AND_CA3");
        eNCtoMPFC=m.createMemoryObject("ENC_TO_MPFC");
        requestSomethingMO=m.createMemoryObject("REQUEST_SOMETHING");
        newEncodedSceneMO=m.createMemoryObject("NEW_ENCODED_SCENE");
        cA3toCA3Process=m.createMemoryObject("CA3_TO_CA3PROCESS");
        sceneMO=m.createMemoryObject("SCENE");
        retrieveSimilarScenesBottomUpMO=m.createMemoryObject("RETRIEVE_SIMILAR_SCENES_BOTTOM_UP");
        retrieveSimilarScenesTopDownMO=m.createMemoryObject("RETRIEVE_SIMILAR_SCENES_TOP_DOWN");
        similarScenesTopDownMO=m.createMemoryObject("SIMILAR_SCENES_TOP_DOWN");
        similarScenesBottomUpMO=m.createMemoryObject("SIMILAR_SCENES_BOTTOM_UP");
        sceneStoreMO=m.createMemoryObject("SCENE_STORE");
        cA3Process2toCA1=m.createMemoryObject("CA3PROCESS2_TO_CA1");
        retrievedSceneTopDownMO=m.createMemoryObject("RETRIEVED_SCENE_TOP_DOWN");
        currentSceneMO=m.createMemoryObject("CURRENT_SCENE");
        cA1toCA1Process2andSB=m.createMemoryObject("CA1_TO_CA1PROCESS2_AND_SB");
        retrievedSceneTopDownLTMMO=m.createMemoryObject("RETRIEVED_SCENE_TOP_DOWN_LTM");
        sceneRelationMO=m.createMemoryObject("SCENE_RELATION");
        sceneIDMO=m.createMemoryObject("SCENE_ID");
        sceneRelationsArrayMO=m.createMemoryObject("SCENE_RELATIONS_ARRAY");
        sceneRelationsMO=m.createMemoryObject("SCENE_RELATIONS");
        retrievedSceneRelationTopDownMO=m.createMemoryObject("RETRIEVED_SCENE_RELATION_TOP_DOWN");
        retrievedSceneRelationTopDownLTMMO=m.createMemoryObject("RETRIEVED_SCENE_RELATION_TOP_DOWN_LTM");
        midTermMemorySceneRelationsMO=m.createMemoryObject("MID_TERM_MEMORY_SCENE_RELATIONS");
        dGtoDGProcess=m.createMemoryObject("DG_TO_DGPROCESS");
        sBtoENC=m.createMemoryObject("SB_TO_ENC");      
 
          
        // Create and populate MindViewer
//        MindView mv = new MindView("MindView");
//        mv.addMO(imagePerceptedaaMO);
        
        //Create Sensor Codelets
        Codelet vision=new Vision();
        vision.addOutput(imagePerceptedMO);
        m.insertCodelet(vision);
        
        Codelet taskFrame=new TaskFrame();
        taskFrame.addOutput(requestObjectRelationMO);
        taskFrame.addOutput(requestObjectMO);
        m.insertCodelet(taskFrame);
        
        Codelet pC=new PC();
        pC.addInput(imagePerceptedMO);
        pC.addOutput(boxCenterPointsMO);
        m.insertCodelet(pC);
        
        Codelet pCBridge=new PCBridge();
        pCBridge.addInput(boxCenterPointsMO);
        pCBridge.addOutput(boxCenterPointsMO);
        m.insertCodelet(pCBridge);
        
        Codelet iTCObject=new ITCObject();
        iTCObject.addInput(imagePerceptedMO);
        iTCObject.addOutput(recognizedObjectsMO);
        m.insertCodelet(iTCObject);
        
        Codelet iTCFeatures=new ITCFeatures();
        iTCFeatures.addInput(imagePerceptedMO);
        iTCFeatures.addOutput(iTCFeaturesMO);
        m.insertCodelet(iTCFeatures);
        
        Codelet iTCBridge=new ITCBridge();
        iTCBridge.addInput(recognizedObjectsMO);
        iTCBridge.addOutput(requestObjectMO);
        iTCBridge.addOutput(recognizedObjectsMO);
        m.insertCodelet(iTCBridge);
        
        Codelet iTCProcess1=new ITCProcess1();
        iTCProcess1.addInput(requestObjectMO);
        iTCProcess1.addOutput(retrievedObjectTopDownMO);
        m.insertCodelet(iTCProcess1);
        
        Codelet pHCBridge=new PHCBridge();
        pHCBridge.addInput(boxCenterPointsMO);
        pHCBridge.addOutput(boxCenterPointsMO);
        m.insertCodelet(pHCBridge);
        
        Codelet PHCProcess1=new PHCProcess1();
        PHCProcess1.addInput(boxCenterPointsMO);
        PHCProcess1.addOutput(unintegratedScenePatternMO);
        m.insertCodelet(PHCProcess1);
        
        Codelet pRCBridge=new PRCBridge();
        pRCBridge.addInput(requestObjectRelationMO);
        pRCBridge.addInput(recognizedObjectsMO);
        pRCBridge.addOutput(recognizedObjectsMO);
        pRCBridge.addOutput(requestObjectRelationMO);
        m.insertCodelet(pRCBridge);
        
        Codelet pRCProcess1=new PRCProcess1();
        pRCProcess1.addInput(recognizedObjectsMO);
        pRCProcess1.addInput(requestObjectRelationMO);
        pRCProcess1.addOutput(recognizedObjectsMO);
        m.insertCodelet(pRCProcess1);
        
        Codelet pRCProcess2=new PRCProcess2();
        pRCProcess2.addInput(recognizedObjectsMO);
        pRCProcess2.addOutput(objectRelationMO);
        m.insertCodelet(pRCProcess2);
        
        Codelet pRCProcess3=new PRCProcess3();
        pRCProcess3.addInput(recognizedObjectsMO);
        pRCProcess3.addOutput(retrieveObjectRelationsMO);
        pRCProcess3.addOutput(pRCProcess3toVLPFC);
        m.insertCodelet(pRCProcess3);
        
        Codelet pRCStorageHandler=new PRCStorageHandler();
        pRCStorageHandler.addInput(objectRelationMO);
        pRCStorageHandler.addInput(retrieveObjectRelationsMO);
        pRCStorageHandler.addOutput(midTermMemoryObjectRelationsMO);
        m.insertCodelet(pRCStorageHandler);
        
        Codelet eNC=new ENC();
        eNC.addInput(unintegratedScenePatternMO);
        eNC.addInput(recognizedObjectsMO);
        eNC.addInput(sBtoENC);
        eNC.addOutput(eNCtoDGandCA3);
        eNC.addOutput(eNCtoMPFC);
        eNC.addOutput(requestSomethingMO);
        m.insertCodelet(eNC);
        
        Codelet cA3=new CA3();
        cA3.addInput(eNCtoDGandCA3);
        cA3.addInput(requestSomethingMO);
        cA3.addInput(newEncodedSceneMO);
        cA3.addOutput(newEncodedSceneMO);
        cA3.addOutput(cA3toCA3Process);
        cA3.addOutput(requestSomethingMO);
        m.insertCodelet(cA3);
        
        Codelet cA3Process1=new CA3Process1();
        cA3Process1.addInput(newEncodedSceneMO);
        cA3Process1.addOutput(sceneMO);
        cA3Process1.addOutput(newEncodedSceneMO);
        m.insertCodelet(cA3Process1);
        
        Codelet cA3Process2=new CA3Process2();
        cA3Process2.addInput(cA3toCA3Process);
        cA3Process2.addInput(similarScenesBottomUpMO);
        cA3Process2.addOutput(retrieveSimilarScenesBottomUpMO);
        cA3Process2.addOutput(cA3Process2toCA1);
        m.insertCodelet(cA3Process2);
        
        Codelet cA3Process3=new CA3Process3();
        cA3Process3.addInput(requestSomethingMO);
        cA3Process3.addInput(similarScenesTopDownMO);
        cA3Process3.addOutput(retrieveSimilarScenesTopDownMO);
        cA3Process3.addOutput(retrievedSceneTopDownMO);
        m.insertCodelet(cA3Process3);
        
        Codelet cA3StorageHandler=new CA3StorageHandler();
        cA3StorageHandler.addInput(sceneMO);
        cA3StorageHandler.addInput(retrieveSimilarScenesBottomUpMO);
        cA3StorageHandler.addInput(retrieveSimilarScenesTopDownMO);
        cA3StorageHandler.addOutput(similarScenesBottomUpMO);
        cA3StorageHandler.addOutput(similarScenesTopDownMO);
        cA3StorageHandler.addOutput(sceneStoreMO);
        m.insertCodelet(cA3StorageHandler);
        
        Codelet cA1=new CA1();
        cA1.addInput(newEncodedSceneMO);
        cA1.addInput(cA3Process2toCA1);
        cA1.addInput(retrievedSceneTopDownMO);
        cA1.addOutput(newEncodedSceneMO);
        cA1.addOutput(cA1toCA1Process2andSB);
        cA1.addOutput(retrievedSceneTopDownLTMMO);
        cA1.addOutput(currentSceneMO);
        m.insertCodelet(cA1);
        
        Codelet cA1Process1=new CA1Process1();
        cA1Process1.addInput(newEncodedSceneMO);
        cA1Process1.addOutput(sceneRelationMO);
        m.insertCodelet(cA1Process1);
        
        Codelet cA1Process2=new CA1Process2();
        cA1Process2.addInput(cA1toCA1Process2andSB);
        cA1Process2.addInput(newEncodedSceneMO);
        cA1Process2.addInput(sceneRelationsArrayMO);
        cA1Process2.addOutput(sceneIDMO);
        cA1Process2.addOutput(retrievedSceneRelationTopDownMO);
        cA1Process2.addOutput(sceneRelationsMO);
        m.insertCodelet(cA1Process2);
        
        Codelet cA1Process3=new CA1Process3();
        cA1Process3.addInput(retrievedSceneTopDownLTMMO);
        cA1Process3.addOutput(retrievedSceneRelationTopDownLTMMO);
        cA1Process3.addOutput(retrievedSceneRelationTopDownMO);
        m.insertCodelet(cA1Process3);
        
        Codelet cA1StorageHandler=new CA1StorageHandler();
        cA1StorageHandler.addInput(sceneRelationMO);
        cA1StorageHandler.addInput(sceneIDMO);
        cA1StorageHandler.addOutput(midTermMemorySceneRelationsMO);
        cA1StorageHandler.addOutput(sceneRelationsArrayMO);
        m.insertCodelet(cA1StorageHandler);
        
        Codelet dGBridge=new DGBridge();
        dGBridge.addInput(eNCtoDGandCA3);
        dGBridge.addOutput(dGtoDGProcess);
        m.insertCodelet(dGBridge);
        
        Codelet dGProcess=new DGProcess();
        dGProcess.addInput(dGtoDGProcess);
        dGProcess.addOutput(newEncodedSceneMO);
        m.insertCodelet(dGProcess);
        
        Codelet mPFC=new MPFC();
        mPFC.addInput(eNCtoMPFC);
        m.insertCodelet(mPFC);
        
        Codelet dLPFC=new DLPFC();
        m.insertCodelet(dLPFC);
        
        Codelet vLPFC=new VLPFC();
        vLPFC.addInput(pRCProcess3toVLPFC);
        vLPFC.addInput(retrievedObjectTopDownMO);
        vLPFC.addInput(iTCFeaturesMO);
        m.insertCodelet(vLPFC);
        
        Codelet sB=new SB();
        sB.addInput(newEncodedSceneMO);
        sB.addInput(currentSceneMO);
        sB.addInput(cA1toCA1Process2andSB);
        sB.addInput(retrievedSceneTopDownLTMMO);
        sB.addInput(sceneRelationsMO);
        sB.addInput(retrievedSceneRelationTopDownMO);
        sB.addInput(retrievedSceneRelationTopDownMO);
        sB.addOutput(sBtoENC);
        m.insertCodelet(sB);
       
        m.start();
        return(m);
    }
    
    public App() {
        Mind m = prepareMind();
        // The next line can be commented if you don't want the Desktop MindViewer
        createAndShowGUI(m);
        // The next line can be commented if you don't use the MindViewer Web
        RESTServer rs = new RESTServer(m,5001,true);
    }
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
    }
}
