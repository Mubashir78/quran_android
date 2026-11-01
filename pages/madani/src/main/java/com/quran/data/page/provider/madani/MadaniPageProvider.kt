package com.quran.data.page.provider.madani

import com.quran.data.model.audio.Qari
import com.quran.data.source.DisplaySize
import com.quran.data.source.PageProvider
import com.quran.data.source.PageSizeCalculator
import com.quran.labs.androidquran.pages.common.madani.size.DefaultPageSizeCalculator
import com.quran.labs.androidquran.pages.data.madani.MadaniDataSource
import com.quran.labs.androidquran.pages.madani.R
import com.quran.labs.androidquran.common.audio.R as audioR

class MadaniPageProvider : PageProvider {

  override fun getDataSource() = dataSource

  override fun getPageSizeCalculator(displaySize: DisplaySize): PageSizeCalculator =
      DefaultPageSizeCalculator(displaySize)

  override fun getImageVersion() = 8

  override fun getImagesBaseUrl() = "$baseUrl/"

  override fun getImagesZipBaseUrl() = "$baseUrl/zips/"

  override fun getPatchBaseUrl() = "$baseUrl/patches/v"

  override fun getAyahInfoBaseUrl() = "$baseUrl/databases/ayahinfo/"

  override fun getAudioDirectoryName() = "audio"

  override fun getDatabaseDirectoryName() = "databases"

  override fun getAyahInfoDirectoryName() = getDatabaseDirectoryName()

  override fun getDatabasesBaseUrl() = "$baseUrl/databases/"

  override fun getAudioDatabasesBaseUrl() = getDatabasesBaseUrl() + "audio/"

  override fun getImagesDirectoryName() = ""

  override fun getPreviewTitle() = R.string.madani_title

  override fun getPreviewDescription() = R.string.madani_description

  override fun getDefaultQariId(): Int = 0

  override fun getQaris(): List<Qari> {
    return listOf(
      Qari(
        0,
        audioR.string.qari_minshawi_murattal_gapless,
        url = "https://download.quranicaudio.com/quran/muhammad_siddeeq_al-minshaawee/",
        path = "minshawi_murattal",
        hasGaplessAlternative = false,
        db = "minshawi_murattal"
      ),
      Qari(
        1,
        audioR.string.qari_husary_gapless,
        url = "https://download.quranicaudio.com/quran/mahmood_khaleel_al-husaree/",
        path = "husary",
        hasGaplessAlternative = false,
        db = "husary"
      ),
      Qari(
        2,
        audioR.string.qari_basfar,
        url = "https://mirrors.quranicaudio.com/everyayah/Abdullah_Basfar_192kbps/",
        path = "2",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        3,
        audioR.string.qari_abdulbaset,
        url = "https://everyayah.com/data/Abdul_Basit_Murattal_192kbps/",
        path = "abdul_basit_murattal",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        4,
        audioR.string.qari_abdulbaset_mujawwad,
        url = "https://everyayah.com/data/Abdul_Basit_Mujawwad_128kbps/",
        path = "abdul_basit_mujawwad",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        5,
        audioR.string.qari_suadis,
        url = "https://everyayah.com/data/Abdurrahmaan_As-Sudais_192kbps/",
        path = "abdurrahmaan_as_sudais",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        6,
        audioR.string.qari_shatri,
        url = "https://everyayah.com/data/Abu_Bakr_Ash-Shaatree_128kbps/",
        path = "abu_bakr_ash_shaatree",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        7,
        audioR.string.qari_afasy,
        url = "https://everyayah.com/data/Alafasy_128kbps/",
        path = "alafasy",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        8,
        audioR.string.qari_saad_al_ghamdi,
        url = "https://everyayah.com/data/Ghamadi_40kbps/",
        path = "ghamadi",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        9,
        audioR.string.qari_walk,
        url = "https://everyayah.com/data/English/Sahih_Intnl_Ibrahim_Walk_192kbps/",
        path = "ibrahim_walk",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        10,
        audioR.string.qari_hani_rifai,
        url = "https://everyayah.com/data/Hani_Rifai_192kbps/",
        path = "hani_rifai",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        11,
        audioR.string.qari_husary_mujawwad,
        url = "https://everyayah.com/data/Husary_128kbps_Mujawwad/",
        path = "husary_mujawwad",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        12,
        audioR.string.qari_hudhayfi,
        url = "https://everyayah.com/data/Hudhaify_128kbps/",
        path = "hudhaify",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        13,
        audioR.string.qari_muaiqly,
        url = "https://everyayah.com/data/Maher_AlMuaiqly_64kbps/",
        path = "maher_almuaiqly",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        14,
        audioR.string.qari_minshawi_mujawwad,
        url = "https://everyayah.com/data/Minshawy_Mujawwad_192kbps/",
        path = "minshawy_mujawwad",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        15,
        audioR.string.qari_tablawy,
        url = "https://everyayah.com/data/Mohammad_al_Tablaway_128kbps/",
        path = "mohammad_al_tablaway",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        16,
        audioR.string.qari_ayyoub,
        url = "https://everyayah.com/data/Muhammad_Ayyoub_128kbps/",
        path = "muhammad_ayyoub",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        17,
        audioR.string.qari_jibreel,
        url = "https://everyayah.com/data/Muhammad_Jibreel_128kbps/",
        path = "muhammad_jibreel",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        18,
        audioR.string.qari_shuraym,
        url = "https://everyayah.com/data/Saood_ash-Shuraym_128kbps/",
        path = "saood_ash_shuraym",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        19,
        audioR.string.qari_dussary,
        url = "https://everyayah.com/data/Yasser_Ad-Dussary_128kbps/",
        path = "yasser_ad_dussary",
        hasGaplessAlternative = false,
        db = null
      )
    )
  }

  companion object {
    private const val baseUrl = "https://android.quran.com/data"
    private val dataSource by lazy { MadaniDataSource() }
  }
}
