import java.util.*; 

class clinical_diagnosis 

{ 

    Scanner sc=new Scanner(System.in); 

    String name,gender,doc_name; 

    String disease="",sym1,sym2,sym3,inp1,inp2,inp3; 

    int i,j,k,l,m,n,f=0,choice1,choice2,age,choice3,choice4,choice5,gen; 

    void intro() 

    { 

        System.out.println("**************************************************************"); 

        System.out.println("              MEDICARE DIAGNOSTICS PVT.LTD"); 

        System.out.println("            Welcome to HEALTH DIAGNOSIS TEST"); 

        System.out.println("**************************************************************"); 

        System.out.println(" "); 

        System.out.println("This is a comprehensive health test which detects any chances of "); 

        System.out.println("having any particular disease based on the symptoms entered by the"); 

        System.out.println("user. This test does not guarentee the conformity of a disease."); 

        System.out.println(" "); 

        System.out.println(" Some of the common symptoms are: \n *fever \n *cough \n *vomiting \n *diarrohea \n *head ache \n *etc"); 

        System.out.println("Do you want to take the Health Diagnosis test"); 

        System.out.println("1.Yes \n2.No"); 

        choice1=sc.nextInt(); 

        switch(choice1) 

        { 

            case 1: 

            System.out.println("\f"); 

            accept(); 

            break; 

            case 2: 

            System.out.println("            THANK YOU AND HAVE A NICE DAY!  "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(2000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.exit(0); 

            break; 

            default: 

            System.out.println("Invalid choice"); 

            System.out.println("You will be taken back to the home screen"); 

            try 

            { 

                Thread.sleep(3000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            main(); 

 

            break; 

        } 

    } 

 

    void accept() 

    { 

        System.out.println("**************************************************************"); 

        System.out.println("                   HEALTH DIAGNOSIS TEST"); 

        System.out.println("**************************************************************"); 

        System.out.println("Enter your name"); 

        name=sc.nextLine(); 

        name=sc.nextLine(); 

        while(name.equals("")) 

        { 

            System.out.println("Sorry, this field cannot be left blank"); 

            name=sc.nextLine(); 

        } 

        System.out.println("Enter your age"); 

        age=sc.nextInt(); 

        while(age>110 ||age<1) 

        { 

            System.out.println("Please enter a valid age"); 

            age=sc.nextInt(); 

        } 

        System.out.print("Enter your gender"); 

        System.out.println("(Male/Female/Other)"); 

        gender=sc.nextLine(); 

        gender=sc.nextLine(); 

        System.out.println("Enter your doctor's name"); 

        doc_name=sc.nextLine(); 

        while(doc_name.equals("")) 

        { 

            System.out.println("Sorry, this field cannot be left blank"); 

            doc_name=sc.nextLine(); 

        } 

        System.out.println("Enter three of your symptoms"); 

        sym1=sc.nextLine(); 

        sym2=sc.nextLine(); 

        sym3=sc.nextLine(); 

        modify(); 

    } 

 

    void modify() 

    { 

        System.out.println("Are you sure you want to save the entries?"); 

        System.out.println("1.Yes \n2.No"); 

        choice2=sc.nextInt(); 

        switch(choice2) 

        { 

            case 1: 

            check(); 

            break; 

            case 2: 

            System.out.println("\f"); 

            accept(); 

            break; 

            default: 

            System.out.println("Invalid choice"); 

            System.out.println("You will be taken back to the home screen"); 

            try 

            { 

                Thread.sleep(3000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            main(); 

 

            break; 

        } 

    } 

 

    void check() 

    { 

        dengue1(); 

        tuberculosis1(); 

        cholera1(); 

        typhoid1(); 

        influenza1(); 

        dysentery1(); 

        malaria1(); 

    } 

 

    void dengue1() 

    { 

        String dengue[]={"fever","cold","muscle pain","muscle cramps"}; 

        for( i=0;i<dengue.length;i++) 

        { 

            if(dengue[i].equalsIgnoreCase(sym1)||dengue[i].equalsIgnoreCase(sym2)||dengue[i].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease +"* dengue"+"\n"; 

        } 

        f=0; 

    } 

 

    void tuberculosis1() 

    { 

        String tuberculosis[]={"cough","chest pain","weight loss","chest congestion"}; 

        for( int j=0;j<tuberculosis.length;j++) 

        { 

            if(tuberculosis[j].equalsIgnoreCase(sym1)||tuberculosis[j].equalsIgnoreCase(sym2)||tuberculosis[j].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease +"* tuberculosis"+"\n"; 

        } 

        f=0; 

    } 

 

    void cholera1() 

    { 

        String cholera[]={"diarrohea","vomiting","stomach ache","dehydration","stomach pain","puking"}; 

        for( int k=0;k<cholera.length;k++) 

        { 

            if(cholera[k].equalsIgnoreCase(sym1)||cholera[k].equalsIgnoreCase(sym2)||cholera[k].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease +"* cholera"+"\n"; 

        } 

        f=0; 

    } 

 

    void typhoid1() 

    { 

        String typhoid[]={"diarrohea","head ache","fever","loose motions"}; 

        for( int l=0;l<typhoid.length;l++) 

        { 

            if(typhoid[l].equalsIgnoreCase(sym1)||typhoid[l].equalsIgnoreCase(sym2)||typhoid[l].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease+"* typhoid"+"\n" ; 

        } 

        f=0; 

    } 

 

    void influenza1() 

    { 

        String influenza[]={"running nose","cold","fever","cough"}; 

        for( int m=0;m<influenza.length;m++) 

        { 

            if(influenza[m].equalsIgnoreCase(sym1)||influenza[m].equalsIgnoreCase(sym2)||influenza[m].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease+"* influenza"+"\n" ; 

        } 

        f=0; 

    } 

 

    void dysentery1() 

    { 

        String dysentery[]={"loose motions","stomach ache","stomach pain","vomiting"}; 

        for( int n=0;n<dysentery.length;n++) 

        { 

            if(dysentery[n].equalsIgnoreCase(sym1)||dysentery[n].equalsIgnoreCase(sym2)||dysentery[n].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease+"* dysentery"+"\n" ; 

        } 

        f=0; 

    } 

 

    void malaria1() 

    { 

        String dengue[]={"fever","cold","muscle pain","muscle cramps","nausea"}; 

        for( i=0;i<dengue.length;i++) 

        { 

            if(dengue[i].equalsIgnoreCase(sym1)||dengue[i].equalsIgnoreCase(sym2)||dengue[i].equalsIgnoreCase(sym3)) 

 

            { 

                f=1; 

            } 

        } 

        if(f==1) 

        { 

            disease=disease +"* malaria"+"\n"; 

        } 

        f=0; 

    } 

 

    void disease_verification() 

    { 

        System.out.println("\f"); 

        System.out.println("**************************************************************"); 

        System.out.println("              MEDICARE DIAGNOSTICS PVT.LTD"); 

        System.out.println("                  DISEASE VERIFICATION"); 

        System.out.println("**************************************************************"); 

        System.out.println(""); 

        System.out.println("We offer tests for the following diseases"); 

        System.out.println("1.Dengue \n2.Tuberculosis \n3.Cholera \n4.Typhoid \n5.Dysentery \n6.Influenza\n7.Malaria"); 

        System.out.println("Please enter your choice"); 

        choice3=sc.nextInt(); 

        switch(choice3) 

        { 

            case 1: 

            System.out.println("**************************************************************"); 

            System.out.println("                   TEST FOR DENGUE"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having very high fever?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you having severe head ache?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you having joint and muscle pains?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            ");; 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for dengue"); 

                System.out.println("You may go for the antibody test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for dengue"); 

                System.out.println("You may not go for the antibody test"); 

            } 

            break; 

            case 2: 

            System.out.println("**************************************************************"); 

            System.out.println("                  TEST FOR TUBERCULOSIS"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having chest pain and problem in breathing?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you having severe cough?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you having bloody sputum?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for tuberculosis"); 

                System.out.println("You may go for the TB blood test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for tuberculosis"); 

                System.out.println("You may not go for the TB blood test"); 

            } 

            break; 

            case 3: 

            System.out.println("**************************************************************"); 

            System.out.println("                      TEST FOR CHOLERA"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having acute diarrohea?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you vomiting often?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you feeling dehydrated?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for V.cholarae virus"); 

                System.out.println("You may go for the stool test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for V.cholarae virus"); 

                System.out.println("You may not go for the stool test"); 

            } 

            break; 

            case 4: 

            System.out.println("**************************************************************"); 

            System.out.println("                   TEST FOR TYPHOID"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having acute diarrohea?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you vomiting often?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you having a head ache?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for S.typhi virus"); 

                System.out.println("You may go for the urine or bone marrow test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for S.typhi virus"); 

                System.out.println("You may not go for the urine or bone marrow  test"); 

            } 

            break; 

            case 5: 

            System.out.println("**************************************************************"); 

            System.out.println("                  TEST FOR DYSENTERY"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having acute diarrohea?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you passing blood in your stools often?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you having a stomach ache?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for E.histolytica virus"); 

                System.out.println("You may go for the antibody blood test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for E.histolytica virus"); 

                System.out.println("You may not go for the antibody blood test"); 

            } 

            break; 

            case 6: 

            System.out.println("**************************************************************"); 

            System.out.println("                 TEST FOR INFLUENZA"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having high fever?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you having a running nose?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you a having a cold?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for influenza virus"); 

                System.out.println("You may go for the Rapid Influenza Diagnostic test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for influenza virus"); 

                System.out.println("You may not go for the Rapid Influenza Diagnostic test"); 

            } 

            break; 

            case 7: 

            System.out.println("**************************************************************"); 

            System.out.println("                   TEST FOR MALARIA"); 

            System.out.println("Answer the following questions in yes or  no"); 

            System.out.println("Are you having very high fever?"); 

            inp1=sc.nextLine(); 

            inp1=sc.nextLine(); 

            System.out.println("Are you experiencing shivers and head aches?"); 

            inp2=sc.nextLine();  

            System.out.println("Are you having joint and muscle pains?"); 

            inp3=sc.nextLine(); 

            System.out.println("\f"); 

            System.out.println("          PLEASE WAIT WHILE WE VERIFY YOUR DISEASE            ");; 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(5000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            System.out.println("                DISEASE VERIFICATION RESULTS                  "); 

            System.out.println("**************************************************************"); 

            if(inp1.equalsIgnoreCase("yes") || inp2.equalsIgnoreCase("yes")||inp3.equalsIgnoreCase("yes")) 

            { 

                System.out.println("You have been tested positive for malaria"); 

                System.out.println("You may go for the antibody blood test"); 

            } 

            else 

            { 

                System.out.println("You have been tested negative for malaria"); 

                System.out.println("You may not go for the antibody blood test"); 

            } 

            break; 

            default: 

            System.out.println("Invalid choice"); 

            System.out.println("You will be taken back to the home screen"); 

            try 

            { 

                Thread.sleep(3000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            main(); 

 

            break; 

        } 

    } 

 

    void display() 

    { 

        System.out.println("\f"); 

        System.out.println("**************************************************************"); 

        System.out.println("              MEDICARE DIAGNOSTICS PVT.LTD"); 

        System.out.println("**************************************************************"); 

        System.out.println("                      DIAGNOSIS REPORT                        "); 

        System.out.println("**************************************************************"); 

        Date date = new Date(); 

        System.out.println("Report generated on: "+date); 

        System.out.println("Patient's name: "+name); 

        System.out.println("Patient's age: "+age); 

        System.out.println("Patient's gender: "+gender); 

        System.out.println("Doctor's name: "+"Dr."+doc_name); 

        System.out.println("Diseases likely to be diagnosed with:\n"+disease); 

        if(disease.equals("")) 

        { 

            System.out.println("Sorry the disease could not be detected based on the symptoms"); 

        } 

        disease=""; 

        System.out.println("**************************************************************"); 

        System.out.println("Do you want to go for further verification of the disease?"); 

        System.out.println("1.Yes \n2.No"); 

        choice4=sc.nextInt(); 

        switch(choice4) 

        { 

            case 1: 

            disease_verification(); 

            break; 

            case 2: 

             System.out.println("            THANK YOU AND HAVE A NICE DAY!  "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(2000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.exit(0); 

            break; 

            default: 

            System.out.println("Invalid Choice"); 

            System.out.println("You will be taken back to the home screen"); 

            try 

            { 

                Thread.sleep(3000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.out.println("\f"); 

            main(); 

 

            break; 

        } 

        System.out.println("**************************************************************"); 

    } 

 

    void ending() 

    { 

        System.out.println(""); 

        System.out.println("Do you want to take the test again?"); 

        System.out.println("1.Yes \n2.No"); 

        choice5=sc.nextInt(); 

        switch(choice5) 

        { 

            case 1: 

            System.out.println("\f"); 

            main(); 

            break; 

            case 2: 

            System.out.println("            THANK YOU AND HAVE A NICE DAY!  "); 

            System.out.println("**************************************************************"); 

            try 

            { 

                Thread.sleep(2000); 

            } 

            catch(InterruptedException ex) 

            { 

            }   

            System.exit(0); 

            break; 

            default: 

            System.out.println("Invalid Choice"); 

            System.out.println("You will be taken back to the home screen"); 

            try 

            { 

                Thread.sleep(3000); 

            } 

            catch(InterruptedException ex) 

            { 

            } 

            System.out.println("\f"); 

            main(); 

 

            break; 

        } 

    } 

 

    void main() 

    { 

        intro(); 

        System.out.println("\f"); 

        System.out.println("                           PLEASE WAIT                        "); 

        System.out.println("**************************************************************"); 

        System.out.println("...................your report is being processed............ "); 

        System.out.println("**************************************************************"); 

        try 

        { 

            Thread.sleep(5000); 

        } 

        catch(InterruptedException ex) 

        { 

        } 

        display(); 

        ending(); 

    } 

} 