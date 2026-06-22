package com.example.project_uts

object RecipeData {

    fun getRecipes(): List<Recipe> {

        return listOf(

            Recipe(
                "Nasi Goreng",
                """
                • 3 piring nasi putih
                • 2 siung bawang putih
                • 2 siung bawang merah
                • 1 butir telur
                • Kecap manis
                • Garam
                """.trimIndent(),

                """
                1. Panaskan minyak.
                2. Tumis bawang.
                3. Masukkan telur.
                4. Tambahkan nasi.
                5. Beri kecap dan garam.
                6. Sajikan.
                """.trimIndent()
            ),

            Recipe(
                "Bubur Ayam",
                """
                • 1 cup beras
                • 6 cup air
                • 200 gram ayam
                • Daun bawang
                • Garam
                """.trimIndent(),

                """
                1. Rebus beras hingga menjadi bubur.
                2. Tambahkan garam.
                3. Masukkan ayam.
                4. Sajikan.
                """.trimIndent()
            ),

            Recipe(
                "Bakwan",
                """
                • Tepung terigu
                • Wortel
                • Kol
                • Daun bawang
                """.trimIndent(),

                """
                1. Campurkan semua bahan.
                2. Tambahkan air.
                3. Goreng hingga matang.
                """.trimIndent()
            ),

            Recipe(
                "Mie Goreng",
                """
                • Mie
                • Bawang putih
                • Telur
                • Kecap manis
                """.trimIndent(),

                """
                1. Rebus mie.
                2. Tumis bawang.
                3. Masukkan telur.
                4. Tambahkan mie.
                5. Sajikan.
                """.trimIndent()
            ),

            Recipe(
                "Soto Ayam",
                """
                • Ayam
                • Serai
                • Daun salam
                • Bihun
                """.trimIndent(),

                """
                1. Rebus ayam.
                2. Tumis bumbu.
                3. Campurkan ke kuah.
                4. Sajikan.
                """.trimIndent()
            )
        )
    }
}