package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val animalList = mutableListOf<Animal>()
    private lateinit var animalAdapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupData()

        animalAdapter = AnimalAdapter(animalList)

        binding.rvAnimal.layoutManager = LinearLayoutManager(this)
        binding.rvAnimal.adapter = animalAdapter
    }

    private fun setupData() {
        animalList.apply {
            add(
                Animal(
                    "Cat",
                    "It is the only domesticated species in the family Felidae and is often referred to as the domestic cat to distinguish it from the wild members of the family."
                )
            )
            add(
                Animal(
                    "Dog",
                    "The dog derived from an ancient, extinct wolf,[5][6] with the modern grey wolf being the dog's nearest living relative"
                )
            )
            add(
                Animal(
                    "Chicken",
                    "The chicken (Gallus gallus domesticus), a subspecies of the red junglefowl, is a type of domesticated fowl, originally from Southeastern Asia."
                )
            )
            add(
                Animal(
                    "Tiger",
                    "The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera. It is most recognisable for its dark vertical stripes on orange-brown fur with a lighter underside."
                )
            )
            add(
                Animal(
                    "Lion",
                    "The lion (Panthera leo) is a species in the family Felidae and a member of the genus Panthera. It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail."
                )
            )
            add(
                Animal(
                    "Eagle",
                    "Eagle is the common name for many large birds of prey of the family Accipitridae."
                )
            )
            add(
                Animal(
                    "Bird",
                    "Birds are a group of warm-blooded vertebrates constituting the class Aves /ˈeɪviːz/, characterised by feathers, toothless beaked jaws, the laying of hard-shelled eggs, a high metabolic rate, a four-chambered heart, and a strong yet lightweight skeleton."
                )
            )
            add(
                Animal(
                    "Fish",
                    "Fish are aquatic, craniate, gill-bearing animals that lack limbs with digits. They form a sister group to the tunicates, together forming the olfactores."
                )
            )
            add(
                Animal(
                    "Bear",
                    "Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans. "
                )
            )
            add(
                Animal(
                    "Mouse",
                    "A mouse, plural mice, is a small rodent. Characteristically, mice are known to have a pointed snout, small rounded ears, a body-length scaly tail, and a high breeding rate"
                )
            )
            add(
                Animal(
                    "Hamster",
                    "Hamsters are rodents (order Rodentia) belonging to the subfamily Cricetinae, which contains 19 species classified in seven genera."
                )
            )

        }


    }
}