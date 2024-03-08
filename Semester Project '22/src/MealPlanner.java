import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class MealPlanner
{	
	static String mealPlan="";
	static String fileNameString="";
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		LinkedList<Meal> meal = new LinkedList<Meal>();
		
        try (
                ObjectInputStream objectInput
                    = new ObjectInputStream(new FileInputStream("src/MealPlanFile.txt"));
            ){
            while (true) {
                meal.add((Meal) objectInput.readObject());
            }
        } catch (EOFException eof) {
//            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
//        System.out.println("This is the meal size currently " + meal.size());
        
        LinkedList<String> bMeals = new LinkedList<String>();
        LinkedList<String> sMeals = new LinkedList<String>();
        LinkedList<String> lMeals = new LinkedList<String>();
        LinkedList<String> dMeals = new LinkedList<String>();
        
//        LinkedList<Meal> weeklyMeal = new LinkedList<Meal>();
        
		JComboBox<Meal> bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> sCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> lCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> sbCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> dCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b2Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s2Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l2Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s2bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d2Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b3Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s3Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l3Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s3bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d3Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b4Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s4Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l4Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s4bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d4Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b5Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s5Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l5Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s5bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d5Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b6Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s6Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l6Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s6bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d6Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        JComboBox<Meal> b7Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s7Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> l7Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> s7bCombo = (JComboBox<Meal>) styleLabel(new JComboBox());
        JComboBox<Meal> d7Combo = (JComboBox<Meal>) styleLabel(new JComboBox());
        
        for(int i = 0; i<meal.size();i++) {
//        	System.out.println(meal.get(i).stringAll());
        	if(meal.get(i).mealID.equals("Breakfast")) {
        		bMeals.add(meal.get(i).mealName);
        		bCombo.addItem(meal.get(i));
        		b2Combo.addItem(meal.get(i));
        		b3Combo.addItem(meal.get(i));
        		b4Combo.addItem(meal.get(i));
        		b5Combo.addItem(meal.get(i));
        		b6Combo.addItem(meal.get(i));
        		b7Combo.addItem(meal.get(i));
        	}else if(meal.get(i).mealID.equals("Snack")) {
        		sMeals.add(meal.get(i).mealName);
        		sCombo.addItem(meal.get(i));
        		s2Combo.addItem(meal.get(i));
        		s3Combo.addItem(meal.get(i));
        		s4Combo.addItem(meal.get(i));
        		s5Combo.addItem(meal.get(i));
        		s6Combo.addItem(meal.get(i));
        		s7Combo.addItem(meal.get(i));
        		sbCombo.addItem(meal.get(i));
        		s2bCombo.addItem(meal.get(i));
        		s3bCombo.addItem(meal.get(i));
        		s4bCombo.addItem(meal.get(i));
        		s5bCombo.addItem(meal.get(i));
        		s6bCombo.addItem(meal.get(i));
        		s7bCombo.addItem(meal.get(i));
        	}else if(meal.get(i).mealID.equals("Lunch")){
        		lMeals.add(meal.get(i).mealName);
        		lCombo.addItem(meal.get(i));
        		l2Combo.addItem(meal.get(i));
        		l3Combo.addItem(meal.get(i));
        		l4Combo.addItem(meal.get(i));
        		l5Combo.addItem(meal.get(i));
        		l6Combo.addItem(meal.get(i));
        		l7Combo.addItem(meal.get(i));
        	}else{
        		dMeals.add(meal.get(i).mealName);
        		dCombo.addItem(meal.get(i));
        		d2Combo.addItem(meal.get(i));
        		d3Combo.addItem(meal.get(i));
        		d4Combo.addItem(meal.get(i));
        		d5Combo.addItem(meal.get(i));
        		d6Combo.addItem(meal.get(i));
        		d7Combo.addItem(meal.get(i));
        	}
        }
          
          
          JLabel breakLabel = (JLabel) styleLabel(new JLabel("Breakfast : "));
//          breakLabel.setBorder(BorderFactory.createLineBorder(Color.black));
          JLabel snackLabel = (JLabel) styleLabel(new JLabel("Snack : "));
          JLabel lunchLabel = (JLabel) styleLabel(new JLabel("Lunch :"));
          JLabel snack2Label = (JLabel) styleLabel(new JLabel("Snack : "));
          JLabel dinnerLabel = (JLabel) styleLabel(new JLabel("Dinner :"));
          JLabel monLabel = (JLabel) styleLabel(new JLabel("Monday"));
          JLabel tueLabel = (JLabel) styleLabel(new JLabel("Tuesday"));
          JLabel wedLabel = (JLabel) styleLabel(new JLabel("Wednesday"));
          JLabel thurLabel = (JLabel) styleLabel(new JLabel("Thursday"));
          JLabel friLabel = (JLabel) styleLabel(new JLabel("Friday"));
          JLabel satLabel = (JLabel) styleLabel(new JLabel("Saturday"));
          JLabel sunLabel = (JLabel) styleLabel(new JLabel("Sunday"));
          JButton newPlanConfirmB = (JButton) styleLabel(new JButton("Confirm"));
          newPlanConfirmB.setBackground(Color.DARK_GRAY);
          newPlanConfirmB.setForeground(Color.white);

        
		  JFrame frame = new JFrame("Meal Planner");
		  frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		  
		  JFrame newPlanFrame = new JFrame("Start new meal plan");
		  newPlanFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  
//		  newPlanFrame.add(bCombo);
		  
		  JFrame newMealFrame = new JFrame("New Meal");
		  newMealFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  
		  newPlanFrame.setLayout(new GridLayout(1,8));
		  newPlanFrame.setMinimumSize(new Dimension(1100,500));
		  newPlanFrame.getContentPane().setBackground(Color.GRAY);
		  frame.setMinimumSize(new Dimension(600,220));
		  frame.getContentPane().setBackground(Color.GRAY);
		  		  
		  newMealFrame.setMinimumSize(new Dimension(470,300));
		  newMealFrame.getContentPane().setBackground(Color.GRAY);
		  
          ////to name file
          JTextField fileNameField = new JTextField();
          fileNameField.setMaximumSize(new Dimension(100,50));
          JLabel spacerLabel = (JLabel) styleLabel(new JLabel("Name of document: "));
          
          JPanel topLeftFileName = new JPanel();
          topLeftFileName.setLayout(new BoxLayout(topLeftFileName,BoxLayout.Y_AXIS));
          topLeftFileName.setBackground(Color.lightGray);
          topLeftFileName.add(spacerLabel);
          topLeftFileName.add(fileNameField);   
		  
		  JPanel mon = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel tues = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel wed = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel thurs = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel fri = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel sat = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel sun = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  JPanel labelPan = (JPanel) styleLabel(new JPanel(new GridLayout(7,1)));
		  
		  labelPan.add(topLeftFileName);
		  labelPan.add(breakLabel);
		  labelPan.add(snackLabel);
		  labelPan.add(lunchLabel);
		  labelPan.add(snack2Label);
		  labelPan.add(dinnerLabel);
		  
		  mon.add(monLabel);
		  mon.add(bCombo);
		  mon.add(sCombo);
		  mon.add(lCombo);
		  mon.add(sbCombo);
		  mon.add(dCombo);
		  
		  tues.add(tueLabel);
		  tues.add(b2Combo);
		  tues.add(s2Combo);
		  tues.add(l2Combo);
		  tues.add(s2bCombo);
		  tues.add(d2Combo);
		  
		  wed.add(wedLabel);
		  wed.add(b3Combo);
		  wed.add(s3Combo);
		  wed.add(l3Combo);
		  wed.add(s3bCombo);
		  wed.add(d3Combo);
		  
		  thurs.add(thurLabel);
		  thurs.add(b4Combo);
		  thurs.add(s4Combo);
		  thurs.add(l4Combo);
		  thurs.add(s4bCombo);
		  thurs.add(d4Combo);
		  
		  fri.add(friLabel);
		  fri.add(b5Combo);
		  fri.add(s5Combo);
		  fri.add(l5Combo);
		  fri.add(s5bCombo);
		  fri.add(d5Combo);
		  
		  sat.add(satLabel);
		  sat.add(b6Combo);
		  sat.add(s6Combo);
		  sat.add(l6Combo);
		  sat.add(s6bCombo);
		  sat.add(d6Combo);
		  
		  sun.add(sunLabel);
		  sun.add(b7Combo);
		  sun.add(s7Combo);
		  sun.add(l7Combo);
		  sun.add(s7bCombo);
		  sun.add(d7Combo);
		  sun.add(newPlanConfirmB);
		  
		  newPlanFrame.add(labelPan);
		  newPlanFrame.add(mon);
		  newPlanFrame.add(tues);
		  newPlanFrame.add(wed);
		  newPlanFrame.add(thurs);
		  newPlanFrame.add(fri);
		  newPlanFrame.add(sat);
		  newPlanFrame.add(sun);
		  
		  
		  JPanel topPanel = new JPanel();
		  JPanel spinnerPanel = new JPanel();
		  JPanel newMealPanel = new JPanel();
		  newMealPanel.setLayout(new BoxLayout(newMealPanel, BoxLayout.Y_AXIS));
		  JPanel bottomMealPanel = new JPanel();
		  
		  JCheckBox check_bfast = new JCheckBox("Breakfast");
		  check_bfast.setBackground(Color.GRAY);
		  JCheckBox check_snack = new JCheckBox("Snack");
		  check_snack.setBackground(Color.GRAY);
		  JCheckBox check_lunch = new JCheckBox("Lunch");
		  check_lunch.setBackground(Color.GRAY);
		  JCheckBox check_dinner =new JCheckBox("Dinner");
		  check_dinner.setBackground(Color.GRAY);
		  
		  JButton newPlan = new JButton("Start New Plan");
		  newPlan.setActionCommand("newPlan");
//	  JButton existPlan = new JButton("Existing Plans");
		  JButton enterMeal = new JButton("Enter new meal");
		  JButton submitNewMeal = (JButton) style(new JButton("Submit"));
		  submitNewMeal.setPreferredSize(new Dimension(100,50));
		  newPlan = (JButton) style(newPlan);
//		  existPlan = (JButton) style(existPlan);
		  enterMeal = (JButton) style(enterMeal);
		  enterMeal.setMaximumSize(new Dimension(100,100));

		  JTextField txt_mealName = (JTextField) styleLabel(new JTextField());
//		  txt_mealName.setBackground(Color.LIGHT_GRAY);
		  JLabel mealNameLabel = new JLabel("Please enter the name of the meal");
		  mealNameLabel.setPreferredSize(new Dimension(10,50));
		  JTextField txt_mealDes = (JTextField) styleLabel(new JTextField(50));

		  newMealPanel.add(mealNameLabel);
		  newMealPanel.add(txt_mealName);
		  
		  spinnerPanel.setLayout(new WrapLayout());

		  JLabel pro = new JLabel("Protein");
		  JTextField txt_protein = (JTextField) styleLabel(new JTextField(10));
		  JLabel gra = new JLabel("Grain");
		  JTextField txt_grain = (JTextField) styleLabel(new JTextField(10));
		  JLabel fru = new JLabel("Fruit");
		  JTextField txt_fruit = (JTextField) styleLabel(new JTextField(10));
		  JLabel veg = new JLabel("Vegetables");
		  JTextField txt_vegetables = (JTextField) styleLabel(new JTextField(10));
		  JLabel fat = new JLabel("Fats");
		  JTextField txt_fats = (JTextField) styleLabel(new JTextField(10));
		  JLabel dai = new JLabel("Dairy");
		  JTextField txt_dairy = (JTextField) styleLabel(new JTextField(10));

		  spinnerPanel.add(pro);
		  spinnerPanel.add(txt_protein);
		  spinnerPanel.add(gra);
		  spinnerPanel.add(txt_grain);
		  spinnerPanel.add(fru);
		  spinnerPanel.add(txt_fruit);
		  spinnerPanel.add(veg);
		  spinnerPanel.add(txt_vegetables);
		  spinnerPanel.add(fat);
		  spinnerPanel.add(txt_fats);
		  spinnerPanel.add(dai);
		  spinnerPanel.add(txt_dairy);
		  spinnerPanel.add(check_bfast);
		  spinnerPanel.add(check_snack);
		  spinnerPanel.add(check_lunch);
		  spinnerPanel.add(check_dinner);
		  
		  spinnerPanel.setBackground(Color.GRAY);
		  newMealPanel.setBackground(Color.GRAY);
		  bottomMealPanel.setBackground(Color.GRAY);
		  bottomMealPanel.add(submitNewMeal);
		  topPanel.setBackground(Color.GRAY);
		  topPanel.add(newPlan);
//		  topPanel.add(existPlan);
		  topPanel.add(enterMeal);
		  topPanel.setBorder(new EmptyBorder(60,60,60,60));
		  
		  newMealFrame.add(spinnerPanel, BorderLayout.CENTER);
		  newMealFrame.add(bottomMealPanel, BorderLayout.SOUTH);
		  newMealFrame.add(newMealPanel, BorderLayout.NORTH);

		  frame.add(topPanel, BorderLayout.NORTH);
		  frame.pack();
		  
		  newPlan.addActionListener(new ActionListener(){ 
	        	@Override
	        	  public void actionPerformed(ActionEvent e) {
	        		newPlanFrame.setVisible(true);	        		
	        		  } 
	        		} );  		  
		  enterMeal.addActionListener(new ActionListener(){ 
	        	@Override
	        	  public void actionPerformed(ActionEvent e) { 
	        		newMealFrame.setVisible(true);
	        		  } 
	        		} );
		  newPlanConfirmB.addActionListener(new ActionListener(){ 
	        	@Override
	        	  public void actionPerformed(ActionEvent e) {
	        		fileNameString = fileNameField.getText() + ".txt";
	        		
	        		mealPlan+= "-----------Monday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(sCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(lCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(sbCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(dCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		
	        		mealPlan+="-----------Tuesday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b2Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s2Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l2Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s2bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d2Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		mealPlan+="-----------Wednesday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b3Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s3Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l3Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s3bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d3Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		mealPlan+= "-----------Thursday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b4Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s4Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l4Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s4bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d4Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		mealPlan+= "-----------Friday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b5Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s5Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l5Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s5bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d5Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		mealPlan+= "-----------Saturday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b6Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s6Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l6Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s6bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d6Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		mealPlan+= "-----------Sunday------------\n";
	        		for(int i = 0; i<meal.size();i++) {
	        			if(b7Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Breakfast")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s7Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(l7Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Lunch")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(s7bCombo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Snack")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		for(int i = 0; i<meal.size();i++) {
	        			if(d7Combo.getSelectedItem().toString().equals(meal.get(i).mealName) && meal.get(i).mealID.equals("Dinner")) {
	        				mealPlan+=meal.get(i).stringAll()+"\n";
	        			}
	        		}
	        		
	        	    File file = new File(fileNameString);
	        	    System.out.print(fileNameString);
	        	    try {
						boolean isFileCreated = file.createNewFile();
						if(!isFileCreated) {
							JFrame fileNotCreatedFrame = new JFrame("File Not Created!");
							JLabel help = new JLabel("File not created. Boo. Try a different name.");
							help = (JLabel) styleLabel(help);
							JButton confirmNotCreatedButton = new JButton("Okay");
							confirmNotCreatedButton = (JButton) style(confirmNotCreatedButton);
							confirmNotCreatedButton.addActionListener(new ActionListener(){ 
						        	@Override
						        	  public void actionPerformed(ActionEvent e) {
						        		fileNotCreatedFrame.setVisible(false);	        		
						        		  } 
						        		} ); 
							fileNotCreatedFrame.setMinimumSize(new Dimension(300,200));
//							fileNotCreatedFrame.add(notCreatedPanel);
							fileNotCreatedFrame.add(confirmNotCreatedButton, BorderLayout.SOUTH);
							fileNotCreatedFrame.add(help, BorderLayout.NORTH);
							fileNotCreatedFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							fileNotCreatedFrame.setVisible(true);
						}else {
							JFrame fileCreatedFrame = new JFrame("File Created!");
							JLabel help2 = new JLabel("File Created. Yay!");
							help2 = (JLabel) styleLabel(help2);
							JButton confirmCreatedButton = new JButton("Okay");
							confirmCreatedButton = (JButton) style(confirmCreatedButton);
							confirmCreatedButton.addActionListener(new ActionListener(){ 
						        	@Override
						        	  public void actionPerformed(ActionEvent e) {
						        		fileCreatedFrame.setVisible(false);	        		
						        		  } 
						        		} ); 
							fileCreatedFrame.setMinimumSize(new Dimension(300,200));
							fileCreatedFrame.add(confirmCreatedButton, BorderLayout.SOUTH);
							fileCreatedFrame.add(help2, BorderLayout.NORTH);
							fileCreatedFrame.add(confirmCreatedButton);
							fileCreatedFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							fileCreatedFrame.setVisible(true);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	    
	        	      FileWriter myWriter;
					try {
						myWriter = new FileWriter(fileNameString);
		        	    myWriter.write(mealPlan);
		        	    myWriter.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        		
//	        		System.out.println(mealPlan);
//	        		newPlanFrame.setVisible(false); //uncomment if wanting to close after plan confirmed
	        	}
		  });
		  submitNewMeal.addActionListener(new ActionListener(){ 
	        	@Override
	        	  public void actionPerformed(ActionEvent e) { 
	        		
	        		int i = meal.size()-1;
	        		
	        		if(check_bfast.isSelected()) {
	        			meal.add(new Meal("Breakfast",txt_mealName.getText(),txt_protein.getText(),txt_grain.getText(),txt_fruit.getText(),txt_vegetables.getText(),txt_fats.getText(),txt_dairy.getText()));
	            		bMeals.add(meal.getLast().mealName);
	            		bCombo.addItem(meal.getLast());
	            		b2Combo.addItem(meal.getLast());
	            		b3Combo.addItem(meal.getLast());
	            		b4Combo.addItem(meal.getLast());
	            		b5Combo.addItem(meal.getLast());
	            		b6Combo.addItem(meal.getLast());
	            		b7Combo.addItem(meal.getLast());
	        		}
	        		i = meal.size()-1;
	        		if(check_snack.isSelected()) {
	        			meal.add(new Meal("Snack",txt_mealName.getText(),txt_protein.getText(),txt_grain.getText(),txt_fruit.getText(),txt_vegetables.getText(),txt_fats.getText(),txt_dairy.getText()));
	        			sCombo.addItem(meal.getLast());
	        			s2Combo.addItem(meal.getLast());
	            		s3Combo.addItem(meal.get(i));
	            		s4Combo.addItem(meal.get(i));
	            		s5Combo.addItem(meal.get(i));
	            		s6Combo.addItem(meal.get(i));
	            		s7Combo.addItem(meal.get(i));
	            		sbCombo.addItem(meal.get(i));
	            		s2bCombo.addItem(meal.get(i));
	            		s3bCombo.addItem(meal.get(i));
	            		s4bCombo.addItem(meal.get(i));
	            		s5bCombo.addItem(meal.get(i));
	            		s6bCombo.addItem(meal.get(i));
	            		s7bCombo.addItem(meal.get(i));
	        		}
	        		i = meal.size()-1;
	        		if(check_lunch.isSelected()) {
	        			meal.add(new Meal("Lunch",txt_mealName.getText(),txt_protein.getText(),txt_grain.getText(),txt_fruit.getText(),txt_vegetables.getText(),txt_fats.getText(),txt_dairy.getText()));
	        			lCombo.addItem(meal.getLast());
	            		l2Combo.addItem(meal.get(i));
	            		l3Combo.addItem(meal.get(i));
	            		l4Combo.addItem(meal.get(i));
	            		l5Combo.addItem(meal.get(i));
	            		l6Combo.addItem(meal.get(i));
	            		l7Combo.addItem(meal.get(i));
	        		}
	        		i = meal.size()-1;
	        		if(check_dinner.isSelected()) {
	        			meal.add(new Meal("Dinner",txt_mealName.getText(),txt_protein.getText(),txt_grain.getText(),txt_fruit.getText(),txt_vegetables.getText(),txt_fats.getText(),txt_dairy.getText()));
	        			dCombo.addItem(meal.getLast());
	            		d2Combo.addItem(meal.get(i));
	            		d3Combo.addItem(meal.get(i));
	            		d4Combo.addItem(meal.get(i));
	            		d5Combo.addItem(meal.get(i));
	            		d6Combo.addItem(meal.get(i));
	            		d7Combo.addItem(meal.get(i));
	        		}	        		       		
	        		
	        		System.out.println();
	        		
	        		txt_protein.setText(null);
	        		txt_grain.setText(null);
	        		txt_fruit.setText(null);
	        		txt_vegetables.setText(null);
	        		txt_fats.setText(null);
	        		txt_dairy.setText(null);
	        		txt_mealName.setText(null);
	        		txt_mealDes.setText(null);
	        		
	        		check_bfast.setSelected(false);
	        		check_snack.setSelected(false);
	        		check_lunch.setSelected(false);
	        		check_dinner.setSelected(false);
	        		  } 
	        		} );
		  
		  frame.addWindowListener(new WindowAdapter() {
		        @Override
		        public void windowClosing(WindowEvent e) {
		            try (
		                    ObjectOutputStream objectOutput
		                        = new ObjectOutputStream(new FileOutputStream("src/MealPlanFile.txt"));
		                    ) {
		                    	for (int i = 0; i < meal.size(); i++) {
		                        objectOutput.writeObject(meal.get(i));
		                    	}
		                    	objectOutput.close();
		                } catch (IOException ex) {
		                    ex.printStackTrace();
		                }
		        	System.exit(0);
		        }
		    });
		  
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
	  }

public static Component style(Component b) {
	
	  b.setFont(new Font("Serif", Font.PLAIN, 14));
	  b.setForeground(Color.white);
	  b.setBackground(Color.DARK_GRAY);
	  b.setPreferredSize(new Dimension(200,100));
	  
	return b;
	}
public static Component styleLabel(Component b) {
	
	b.setBackground(Color.LIGHT_GRAY);
	return b;
}
public void actionPerformed(ActionEvent ev) {
	}
}