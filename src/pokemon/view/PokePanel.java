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
		nameLabel = new JLabel("Name");
		numberLabel = new JLabel("No.");
		evolvableLabel = new JLabel("Evolvable");
		modifierLabel = new JLabel("Modifier");
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea(5,10);
		typeArea = new JTextArea(4,15);

		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		fifthType = new JPanel();
		sixthType = new JPanel();
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
