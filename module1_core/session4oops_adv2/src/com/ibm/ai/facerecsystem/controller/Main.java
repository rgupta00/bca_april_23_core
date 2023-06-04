package com.ibm.ai.facerecsystem.controller;

import com.ibm.ai.facerecsystem.db.Face;

public class Main {
    public static void main(String[] args) {
        //contextual problem : Face ui  ---- db
        Face face=new Face();
        face.saveFacePixelToDb();

        //less
        com.ibm.ai.facerecsystem.ui.Face face1=new com.ibm.ai.facerecsystem.ui.Face();
        face1.printFacePixelToUI();

    }
}
