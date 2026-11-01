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
      ),
      Qari(
        20,
        audioR.string.qari_juhany_gapless,
        url = "https://everyayah.com/data/Abdullaah_3awwaad_Al-Juhaynee_128kbps/",
        path = "abdullah_al_juhany",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        21,
        audioR.string.qari_abdullah_matroud_gapped,
        url = "https://everyayah.com/data/Abdullah_Matroud_128kbps/",
        path = "abdullah_matroud",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        22,
        audioR.string.qari_ahmad_nauina_gapless,
        url = "https://everyayah.com/data/Ahmed_Neana_128kbps/",
        path = "ahmed_neana",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        23,
        audioR.string.qari_ajamy_gapless,
        url = "https://everyayah.com/data/ahmed_ibn_ali_al_ajamy_128kbps/",
        path = "ahmed_ibn_ali_al_ajamy",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        24,
        audioR.string.qari_akram_al_alaqmi,
        url = "https://everyayah.com/data/Akram_AlAlaqimy_128kbps/",
        path = "akram_al_alaqimy",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        25,
        audioR.string.qari_ali_jaber_gapless,
        url = "https://everyayah.com/data/Ali_Jaber_64kbps/",
        path = "ali_jaber",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        26,
        audioR.string.qari_ali_hajjaj_alsouasi_gapless,
        url = "https://everyayah.com/data/Ali_Hajjaj_AlSuesy_128kbps/",
        path = "ali_hajjaj_alsuesy",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        27,
        audioR.string.qari_ayman_suwaid_gapped,
        url = "https://everyayah.com/data/Ayman_Sowaid_64kbps/",
        path = "ayman_sowaid",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        28,
        audioR.string.qari_aziz_alili_gapless,
        url = "https://everyayah.com/data/aziz_alili_128kbps/",
        path = "aziz_alili",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        29,
        audioR.string.qari_fares_abbad_gapped,
        url = "https://everyayah.com/data/Fares_Abbad_64kbps/",
        path = "fares_abbad",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        30,
        audioR.string.qari_husary_muallim_gapped,
        url = "https://everyayah.com/data/Husary_Muallim_128kbps/",
        path = "husary_muallim",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        31,
        audioR.string.qari_ibrahim_alakhdar_gapped,
        url = "https://everyayah.com/data/Ibrahim_Akhdar_32kbps/",
        path = "ibrahim_akhdar",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        32,
        audioR.string.qari_khalifa_taniji_gapless,
        url = "https://everyayah.com/data/khalefa_al_tunaiji_64kbps/",
        path = "khalefa_al_tunaiji",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        33,
        audioR.string.qari_khalid_qahtani_gapless,
        url = "https://everyayah.com/data/Khaalid_Abdullaah_al-Qahtaanee_192kbps/",
        path = "khaalid_abdullaah_al_qahtaanee",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        34,
        audioR.string.qari_mahmoud_ali_albana_gapless,
        url = "https://everyayah.com/data/mahmoud_ali_al_banna_32kbps/",
        path = "mahmoud_ali_al_banna",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        35,
        audioR.string.qari_abdulmuhsin_qasim_gapped,
        url = "https://everyayah.com/data/Muhsin_Al_Qasim_192kbps/",
        path = "muhsin_al_qasim",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        36,
        audioR.string.qari_qatami_gapless,
        url = "https://everyayah.com/data/Nasser_Alqatami_128kbps/",
        path = "nasser_alqatami",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        37,
        audioR.string.qari_nabil_rifa3i_gapless,
        url = "https://everyayah.com/data/Nabil_Rifa3i_48kbps/",
        path = "nabil_rifa3i",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        38,
        audioR.string.qari_sahl_yaseen_gapped,
        url = "https://everyayah.com/data/Sahl_Yassin_128kbps/",
        path = "sahl_yassin",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        39,
        audioR.string.qari_salah_bukhatir_gapless,
        url = "https://everyayah.com/data/Salaah_AbdulRahman_Bukhatir_128kbps/",
        path = "salaah_abdulrahman_bukhatir",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        40,
        audioR.string.qari_salah_budair_gapped,
        url = "https://everyayah.com/data/Salah_Al_Budair_128kbps/",
        path = "salah_al_budair",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        41,
        audioR.string.qari_yasser_salama_hadr_gapless,
        url = "https://everyayah.com/data/Yaser_Salamah_128kbps/",
        path = "yaser_salamah",
        hasGaplessAlternative = false,
        db = null
      ),
      Qari(
        42,
        audioR.string.qari_qatami_gapless,
        url = "https://download.quranicaudio.com/quran/nasser_bin_ali_alqatami/",
        path = "qatami_gapless",
        hasGaplessAlternative = false,
        db = "qatami"
      ),
      Qari(
        43,
        audioR.string.qari_shatri_gapless,
        url = "https://download.quranicaudio.com/quran/abu_bakr_ash-shaatree/",
        path = "shatri_gapless",
        hasGaplessAlternative = false,
        db = "shatri"
      ),
      Qari(
        44,
        audioR.string.qari_shuraym_gapless,
        url = "https://download.quranicaudio.com/quran/sa3ood_al-shuraym/",
        path = "shuraym_gapless",
        hasGaplessAlternative = false,
        db = "shuraym"
      ),
      Qari(
        45,
        audioR.string.qari_hani_rifai_gapless,
        url = "https://download.quranicaudio.com/quran/rifai/",
        path = "hani_rifai_gapless",
        hasGaplessAlternative = false,
        db = "hani_rifai"
      ),
      Qari(
        46,
        audioR.string.qari_yasser_dussary_gapless,
        url = "https://download.quranicaudio.com/quran/yasser_ad-dussary/",
        path = "yasser_dussary_gapless",
        hasGaplessAlternative = false,
        db = "yasser_dussary"
      ),
      Qari(
        47,
        audioR.string.qari_raad_al_kurdi_gapless,
        url = "https://download.quranicaudio.com/quran/raad_mohammad_al_kurdi/mp3/",
        path = "raad_al_kurdi_gapless",
        hasGaplessAlternative = false,
        db = "raad_al_kurdi"
      ),
      Qari(
        48,
        audioR.string.qari_luhaidan_gapless,
        url = "https://download.quranicaudio.com/quran/muhammad_alhaidan/",
        path = "luhaidan_gapless",
        hasGaplessAlternative = false,
        db = "muhammad_al_luhaidan"
      ),
      Qari(
        49,
        audioR.string.qari_idrees_abkar_gapless,
        url = "https://download.quranicaudio.com/quran/idrees_abkar/",
        path = "idrees_abkar_gapless",
        hasGaplessAlternative = false,
        db = "idrees_abkar"
      ),
      Qari(
        50,
        audioR.string.qari_abdulmuhsin_qasim_gapless,
        url = "https://download.quranicaudio.com/quran/abdul_muhsin_alqasim/",
        path = "abdulmuhsin_alqasim_gapless",
        hasGaplessAlternative = false,
        db = "abdul_muhsin_alqasim"
      ),
      Qari(
        51,
        audioR.string.qari_minshawi_mujawwad_gapless,
        url = "https://download.quranicaudio.com/quran/minshawi_mujawwad/",
        path = "minshawi_mujawwad_gapless",
        hasGaplessAlternative = false,
        db = "minshawi_mujawwad"
      ),
      Qari(
        52,
        audioR.string.qari_husary_mujawwad_gapless,
        url = "https://download.quranicaudio.com/quran/generated/husary_mujawwad/",
        path = "husary_mujawwad_gapless",
        hasGaplessAlternative = false,
        db = "husary_mujawwad"
      ),
      Qari(
        53,
        audioR.string.qari_husary_muallim_gapless,
        url = "https://download.quranicaudio.com/quran/husary_muallim/",
        path = "husary_muallim_gapless",
        hasGaplessAlternative = false,
        db = "husary_muallim"
      ),
      Qari(
        54,
        audioR.string.qari_abdullah_matroud_gapless,
        url = "https://download.quranicaudio.com/quran/abdullah_matroud/",
        path = "matroud_gapless",
        hasGaplessAlternative = false,
        db = "abdullah_matroud"
      ),
      Qari(
        55,
        audioR.string.qari_bandar_baleela_gapless,
        url = "https://download.quranicaudio.com/quran/bandar_baleela/",
        path = "bandar_baleela_gapless",
        hasGaplessAlternative = false,
        db = "bandar_baleela"
      ),
      Qari(
        56,
        audioR.string.qari_ibrahim_alakhdar_gapless,
        url = "https://download.quranicaudio.com/quran/ibrahim_al_akhdar/",
        path = "ibrahim_alakhdar_gapless",
        hasGaplessAlternative = false,
        db = "ibrahim_alakhdar"
      ),
      Qari(
        57,
        audioR.string.qari_sahl_yaseen_gapless,
        url = "https://download.quranicaudio.com/quran/sahl_yaaseen/",
        path = "sahl_yaseen_gapless",
        hasGaplessAlternative = false,
        db = "sahl_yaseen"
      ),
      Qari(
        58,
        audioR.string.qari_salah_budair_gapless,
        url = "https://download.quranicaudio.com/quran/salahbudair/",
        path = "salah_budair_gapless",
        hasGaplessAlternative = false,
        db = "salah_budair"
      ),
      Qari(
        59,
        audioR.string.qari_fares_abbad_gapless,
        url = "https://download.quranicaudio.com/quran/fares/",
        path = "fares_abbad_gapless",
        hasGaplessAlternative = false,
        db = "fares_abbad"
      ),
      Qari(
        60,
        audioR.string.qari_abdulaziz_zahrani_gapless,
        url = "https://download.quranicaudio.com/quran/abdulaziz_bin_saleh_alzahrani/",
        path = "abdulaziz_zahrani_gapless",
        hasGaplessAlternative = false,
        db = "abdulaziz_zahrani"
      ),
      Qari(
        61,
        audioR.string.qari_mostafa_ismaeel_gapless,
        url = "https://download.quranicaudio.com/quran/mostafa_ismaeel/",
        path = "mostafa_ismaeel_gapless",
        hasGaplessAlternative = false,
        db = "mostafa_ismaeel"
      ),
      Qari(
        62,
        audioR.string.qari_abdurrashid_sufi_gapless,
        url = "https://download.quranicaudio.com/quran/abdurrashid_sufi/",
        path = "abdurrashid_sufi_gapless",
        hasGaplessAlternative = false,
        db = "abdurrashid_sufi"
      ),
      Qari(
        63,
        audioR.string.qari_walk_gapless,
        url = "https://download.quranicaudio.com/quran/abdullah_basfar_w_ibrahim_walk_si/",
        path = "ibrahim_walk_gapless",
        hasGaplessAlternative = false,
        db = "ibrahim_walk"
      ),
      Qari(
        64,
        audioR.string.qari_abdulbaset_mujawwad_gapless,
        url = "https://download.quranicaudio.com/quran/abdulbaset_mujawwad/",
        path = "abdulbaset_mujawwad_gapless",
        hasGaplessAlternative = false,
        db = "abdul_basit_mujawwad"
      ),
      Qari(
        65,
        audioR.string.qari_abdulbaset_gapless,
        url = "https://download.quranicaudio.com/quran/abdul_basit_murattal/",
        path = "abdulbaset_gapless",
        hasGaplessAlternative = false,
        db = "abdul_basit_murattal"
      )
    )
  }

  companion object {
    private const val baseUrl = "https://android.quran.com/data"
    private val dataSource by lazy { MadaniDataSource() }
  }
}
