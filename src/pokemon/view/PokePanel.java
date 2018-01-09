package pokemon.view;

import pokemon.controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokePanel extends JPanel
{
	private Controller appController;
	private SpringLayout baseLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	private JLabel pictureLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	private JPanel fifthType;
	private JPanel sixthType;
	//private JPanel seventhType;
	
	
	public PokePanel(Controller appController) 
	{
		super();
		this.appController = appController;
		
		baseLayout = new SpringLayout();
		
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		baseLayout.putConstraint(SpringLayout.NORTH, attackLabel, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, attackLabel, 277, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -12, SpringLayout.NORTH, attackLabel);
		nameLabel = new JLabel("Name");
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 23, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -266, SpringLayout.SOUTH, this);
		numberLabel = new JLabel("No.");
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		evolvableLabel = new JLabel("Evolvable");
		baseLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, healthLabel);
		modifierLabel = new JLabel("Modifier");
		baseLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 17, SpringLayout.SOUTH, modifierLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 19, SpringLayout.SOUTH, attackLabel);
		baseLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, healthLabel);
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, healthLabel);
		pictureLabel = new JLabel(new ImageIcon(getClass().getResource("/pokemon/view/images/Cubchoo.png")), JLabel.CENTER);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 213, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 13, SpringLayout.EAST, nameLabel);
		numberField = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 245, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -97, SpringLayout.WEST, iconLabel);
		attackField = new JTextField();
		baseLayout.putConstraint(SpringLayout.WEST, evolvableBox, 0, SpringLayout.WEST, attackField);
		baseLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		baseLayout.putConstraint(SpringLayout.WEST, attackField, 56, SpringLayout.EAST, attackLabel);
		healthField = new JTextField();
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 56, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -242, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		modifierField = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 5, SpringLayout.SOUTH, modifierField);
		baseLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		baseLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, attackField);
		baseLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, attackField);
		
		descriptionArea = new JTextArea(5,10);
		baseLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, 0, SpringLayout.SOUTH, iconLabel);
		baseLayout.putConstraint(SpringLayout.EAST, descriptionArea, 238, SpringLayout.WEST, this);
		typeArea = new JTextArea(4,15);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -97, SpringLayout.WEST, typeArea);
		baseLayout.putConstraint(SpringLayout.NORTH, iconLabel, 15, SpringLayout.SOUTH, typeArea);
		baseLayout.putConstraint(SpringLayout.WEST, typeArea, 0, SpringLayout.WEST, healthLabel);

		saveButton = new JButton("Save");
		baseLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, descriptionArea);
		clearButton = new JButton("Clear");
		baseLayout.putConstraint(SpringLayout.EAST, clearButton, -585, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 21, SpringLayout.EAST, clearButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, clearButton, -6, SpringLayout.NORTH, descriptionArea);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pokedexDropdown = new JComboBox();
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 6, SpringLayout.SOUTH, evolvableLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 277, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -260, SpringLayout.EAST, this);
		
		firstType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, firstType, 18, SpringLayout.SOUTH, pokedexDropdown);
		baseLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, healthLabel);
		secondType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, secondType, 18, SpringLayout.SOUTH, pokedexDropdown);
		baseLayout.putConstraint(SpringLayout.EAST, secondType, 0, SpringLayout.EAST, healthLabel);
		thirdType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, thirdType, 18, SpringLayout.SOUTH, pokedexDropdown);
		baseLayout.putConstraint(SpringLayout.WEST, thirdType, 26, SpringLayout.EAST, secondType);
		baseLayout.putConstraint(SpringLayout.SOUTH, thirdType, -301, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, thirdType, -346, SpringLayout.EAST, this);
		fourthType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, typeArea, 16, SpringLayout.SOUTH, fourthType);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthType, 6, SpringLayout.SOUTH, firstType);
		baseLayout.putConstraint(SpringLayout.WEST, fourthType, 0, SpringLayout.WEST, healthLabel);
		fifthType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, fifthType, 6, SpringLayout.SOUTH, secondType);
		baseLayout.putConstraint(SpringLayout.WEST, fifthType, 0, SpringLayout.WEST, secondType);
		sixthType = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, sixthType, 6, SpringLayout.SOUTH, thirdType);
		baseLayout.putConstraint(SpringLayout.WEST, sixthType, 0, SpringLayout.WEST, thirdType);
		baseLayout.putConstraint(SpringLayout.SOUTH, sixthType, -16, SpringLayout.NORTH, typeArea);
		baseLayout.putConstraint(SpringLayout.EAST, sixthType, -346, SpringLayout.EAST, this);
		//seventhType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
		//setupScrollPane();
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
		fifthType.setSize(50,50);
		sixthType.setSize(50,50);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
				
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		this.add(pictureLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
		this.add(fifthType);
		this.add(sixthType);
		//this.add(seventhType);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent  selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			
			}
		});
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	private void updateTypePanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Water"))
		{
			firstType.setBackground(Color.BLUE);
		}
		else if (types[0].equals("Ice"))
		{
			secondType.setBackground(Color.CYAN);
		}
		else if (types[0].equals("Dragon"))
		{
			thirdType.setBackground(Color.darkGray);
		}
		else if (types[0].equals("Fire"))
		{
			fourthType.setBackground(Color.ORANGE);
		}
		else if (types[0].equals("Grass"))
		{
			fifthType.setBackground(Color.GREEN);
		}
		else if (types[0].equals("Normal"))
		{
			sixthType.setBackground(new Color(139, 69,  19));
		}
		else
		{
			firstType.setBackground(Color.white);
		}
		
		if (types.length > 1)
		{
			if (types[1].equals("Water"))
			{
				secondType.setBackground(Color.BLUE);
			}
			
			if (types.length == 3)
			{
				secondType.setBackground(Color.BLACK);
			}
		}
		
	}
	private void  updateImage()
	{
		
	}
}
