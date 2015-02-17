package org.jfxvnc.net.rfb.codec.input;

public interface IKeyEventMap {

    int RFB_VoidSymbol = 0xFFFFFF /* void symbol */;
    int RFB_BackSpace = 0xFF08 /* back space, back char */;
    int RFB_Tab = 0xFF09;
    int RFB_Linefeed = 0xFF0A /* Linefeed, LF */;
    int RFB_Clear = 0xFF0B;
    int RFB_Return = 0xFF0D /* Return, enter */;
    int RFB_Pause = 0xFF13 /* Pause, hold */;
    int RFB_Scroll_Lock = 0xFF14;
    int RFB_Sys_Req = 0xFF15;
    int RFB_Escape = 0xFF1B;
    int RFB_Delete = 0xFFFF /* Delete, rubout */;
    int RFB_Multi_key = 0xFF20 /* Multi-key character compose */;
    int RFB_SingleCandidate = 0xFF3C;
    int RFB_MultipleCandidate = 0xFF3D;
    int RFB_PreviousCandidate = 0xFF3E;
    int RFB_Kanji = 0xFF21 /* Kanji, Kanji convert */;
    int RFB_Muhenkan = 0xFF22 /* Cancel Conversion */;
    int RFB_Henkan_Mode = 0xFF23 /* Start/Stop Conversion */;
    int RFB_Henkan = 0xFF23 /* Alias for Henkan_Mode */;
    int RFB_Romaji = 0xFF24 /* to Romaji */;
    int RFB_Hiragana = 0xFF25 /* to Hiragana */;
    int RFB_Katakana = 0xFF26 /* to Katakana */;
    int RFB_Hiragana_Katakana = 0xFF27 /* Hiragana/Katakana toggle */;
    int RFB_Zenkaku = 0xFF28 /* to Zenkaku */;
    int RFB_Hankaku = 0xFF29 /* to Hankaku */;
    int RFB_Zenkaku_Hankaku = 0xFF2A /* Zenkaku/Hankaku toggle */;
    int RFB_Touroku = 0xFF2B /* Add to Dictionary */;
    int RFB_Massyo = 0xFF2C /* Delete from Dictionary */;
    int RFB_Kana_Lock = 0xFF2D /* Kana Lock */;
    int RFB_Kana_Shift = 0xFF2E /* Kana Shift */;
    int RFB_Eisu_Shift = 0xFF2F /* Alphanumeric Shift */;
    int RFB_Eisu_toggle = 0xFF30 /* Alphanumeric toggle */;
    int RFB_Zen_Koho = 0xFF3D /* Multiple/All Candidate(s) */;
    int RFB_Mae_Koho = 0xFF3E /* Previous Candidate */;
    int RFB_Home = 0xFF50;
    int RFB_Left = 0xFF51 /* Move left, left arrow */;
    int RFB_Up = 0xFF52 /* Move up, up arrow */;
    int RFB_Right = 0xFF53 /* Move right, right arrow */;
    int RFB_Down = 0xFF54 /* Move down, down arrow */;
    int RFB_Prior = 0xFF55 /* Prior, previous */;
    int RFB_Page_Up = 0xFF55;
    int RFB_Next = 0xFF56 /* Next */;
    int RFB_Page_Down = 0xFF56;
    int RFB_End = 0xFF57 /* EOL */;
    int RFB_Begin = 0xFF58 /* BOL */;
    int RFB_Select = 0xFF60 /* Select, mark */;
    int RFB_Print = 0xFF61;
    int RFB_Execute = 0xFF62 /* Execute, run, do */;
    int RFB_Insert = 0xFF63 /* Insert, insert here */;
    int RFB_Undo = 0xFF65 /* Undo, oops */;
    int RFB_Redo = 0xFF66 /* redo, again */;
    int RFB_Menu = 0xFF67;
    int RFB_Find = 0xFF68 /* Find, search */;
    int RFB_Cancel = 0xFF69 /* Cancel, stop, abort, exit */;
    int RFB_Help = 0xFF6A /* Help */;
    int RFB_Break = 0xFF6B;
    int RFB_Mode_switch = 0xFF7E /* Character set switch */;
    int RFB_script_switch = 0xFF7E /* Alias for mode_switch */;
    int RFB_Num_Lock = 0xFF7F;
    int RFB_KP_Space = 0xFF80 /* space */;
    int RFB_KP_Tab = 0xFF89;
    int RFB_KP_Enter = 0xFF8D /* enter */;
    int RFB_KP_F1 = 0xFF91 /* PF1, KP_A, ... */;
    int RFB_KP_F2 = 0xFF92;
    int RFB_KP_F3 = 0xFF93;
    int RFB_KP_F4 = 0xFF94;
    int RFB_KP_Home = 0xFF95;
    int RFB_KP_Left = 0xFF96;
    int RFB_KP_Up = 0xFF97;
    int RFB_KP_Right = 0xFF98;
    int RFB_KP_Down = 0xFF99;
    int RFB_KP_Prior = 0xFF9A;
    int RFB_KP_Page_Up = 0xFF9A;
    int RFB_KP_Next = 0xFF9B;
    int RFB_KP_Page_Down = 0xFF9B;
    int RFB_KP_End = 0xFF9C;
    int RFB_KP_Begin = 0xFF9D;
    int RFB_KP_Insert = 0xFF9E;
    int RFB_KP_Delete = 0xFF9F;
    int RFB_KP_Equal = 0xFFBD /* equals */;
    int RFB_KP_Multiply = 0xFFAA;
    int RFB_KP_Add = 0xFFAB;
    int RFB_KP_Separator = 0xFFAC /* separator, often comma */;
    int RFB_KP_Subtract = 0xFFAD;
    int RFB_KP_Decimal = 0xFFAE;
    int RFB_KP_Divide = 0xFFAF;
    int RFB_KP_0 = 0xFFB0;
    int RFB_KP_1 = 0xFFB1;
    int RFB_KP_2 = 0xFFB2;
    int RFB_KP_3 = 0xFFB3;
    int RFB_KP_4 = 0xFFB4;
    int RFB_KP_5 = 0xFFB5;
    int RFB_KP_6 = 0xFFB6;
    int RFB_KP_7 = 0xFFB7;
    int RFB_KP_8 = 0xFFB8;
    int RFB_KP_9 = 0xFFB9;
    int RFB_F1 = 0xFFBE;
    int RFB_F2 = 0xFFBF;
    int RFB_F3 = 0xFFC0;
    int RFB_F4 = 0xFFC1;
    int RFB_F5 = 0xFFC2;
    int RFB_F6 = 0xFFC3;
    int RFB_F7 = 0xFFC4;
    int RFB_F8 = 0xFFC5;
    int RFB_F9 = 0xFFC6;
    int RFB_F10 = 0xFFC7;
    int RFB_F11 = 0xFFC8;
    int RFB_L1 = 0xFFC8;
    int RFB_F12 = 0xFFC9;
    int RFB_L2 = 0xFFC9;
    int RFB_F13 = 0xFFCA;
    int RFB_L3 = 0xFFCA;
    int RFB_F14 = 0xFFCB;
    int RFB_L4 = 0xFFCB;
    int RFB_F15 = 0xFFCC;
    int RFB_L5 = 0xFFCC;
    int RFB_F16 = 0xFFCD;
    int RFB_L6 = 0xFFCD;
    int RFB_F17 = 0xFFCE;
    int RFB_L7 = 0xFFCE;
    int RFB_F18 = 0xFFCF;
    int RFB_L8 = 0xFFCF;
    int RFB_F19 = 0xFFD0;
    int RFB_L9 = 0xFFD0;
    int RFB_F20 = 0xFFD1;
    int RFB_L10 = 0xFFD1;
    int RFB_F21 = 0xFFD2;
    int RFB_R1 = 0xFFD2;
    int RFB_F22 = 0xFFD3;
    int RFB_R2 = 0xFFD3;
    int RFB_F23 = 0xFFD4;
    int RFB_R3 = 0xFFD4;
    int RFB_F24 = 0xFFD5;
    int RFB_R4 = 0xFFD5;
    int RFB_F25 = 0xFFD6;
    int RFB_R5 = 0xFFD6;
    int RFB_F26 = 0xFFD7;
    int RFB_R6 = 0xFFD7;
    int RFB_F27 = 0xFFD8;
    int RFB_R7 = 0xFFD8;
    int RFB_F28 = 0xFFD9;
    int RFB_R8 = 0xFFD9;
    int RFB_F29 = 0xFFDA;
    int RFB_R9 = 0xFFDA;
    int RFB_F30 = 0xFFDB;
    int RFB_R10 = 0xFFDB;
    int RFB_F31 = 0xFFDC;
    int RFB_R11 = 0xFFDC;
    int RFB_F32 = 0xFFDD;
    int RFB_R12 = 0xFFDD;
    int RFB_F33 = 0xFFDE;
    int RFB_R13 = 0xFFDE;
    int RFB_F34 = 0xFFDF;
    int RFB_R14 = 0xFFDF;
    int RFB_F35 = 0xFFE0;
    int RFB_R15 = 0xFFE0;
    int RFB_Shift_L = 0xFFE1 /* Left shift */;
    int RFB_Shift_R = 0xFFE2 /* Right shift */;
    int RFB_Control_L = 0xFFE3 /* Left control */;
    int RFB_Control_R = 0xFFE4 /* Right control */;
    int RFB_Caps_Lock = 0xFFE5 /* Caps lock */;
    int RFB_Shift_Lock = 0xFFE6 /* Shift lock */;
    int RFB_Meta_L = 0xFFE7 /* Left meta */;
    int RFB_Meta_R = 0xFFE8 /* Right meta */;
    int RFB_Alt_L = 0xFFE9 /* Left alt */;
    int RFB_Alt_R = 0xFFEA /* Right alt */;
    int RFB_Super_L = 0xFFEB /* Left super */;
    int RFB_Super_R = 0xFFEC /* Right super */;
    int RFB_Hyper_L = 0xFFED /* Left hyper */;
    int RFB_Hyper_R = 0xFFEE /* Right hyper */;
    int RFB_ISO_Lock = 0xFE01;
    int RFB_ISO_Level2_Latch = 0xFE02;
    int RFB_ISO_Level3_Shift = 0xFE03;
    int RFB_ISO_Level3_Latch = 0xFE04;
    int RFB_ISO_Level3_Lock = 0xFE05;
    int RFB_ISO_Group_Shift = 0xFF7E /* Alias for mode_switch */;
    int RFB_ISO_Group_Latch = 0xFE06;
    int RFB_ISO_Group_Lock = 0xFE07;
    int RFB_ISO_Next_Group = 0xFE08;
    int RFB_ISO_Next_Group_Lock = 0xFE09;
    int RFB_ISO_Prev_Group = 0xFE0A;
    int RFB_ISO_Prev_Group_Lock = 0xFE0B;
    int RFB_ISO_First_Group = 0xFE0C;
    int RFB_ISO_First_Group_Lock = 0xFE0D;
    int RFB_ISO_Last_Group = 0xFE0E;
    int RFB_ISO_Last_Group_Lock = 0xFE0F;
    int RFB_ISO_Left_Tab = 0xFE20;
    int RFB_ISO_Move_Line_Up = 0xFE21;
    int RFB_ISO_Move_Line_Down = 0xFE22;
    int RFB_ISO_Partial_Line_Up = 0xFE23;
    int RFB_ISO_Partial_Line_Down = 0xFE24;
    int RFB_ISO_Partial_Space_Left = 0xFE25;
    int RFB_ISO_Partial_Space_Right = 0xFE26;
    int RFB_ISO_Set_Margin_Left = 0xFE27;
    int RFB_ISO_Set_Margin_Right = 0xFE28;
    int RFB_ISO_Release_Margin_Left = 0xFE29;
    int RFB_ISO_Release_Margin_Right = 0xFE2A;
    int RFB_ISO_Release_Both_Margins = 0xFE2B;
    int RFB_ISO_Fast_Cursor_Left = 0xFE2C;
    int RFB_ISO_Fast_Cursor_Right = 0xFE2D;
    int RFB_ISO_Fast_Cursor_Up = 0xFE2E;
    int RFB_ISO_Fast_Cursor_Down = 0xFE2F;
    int RFB_ISO_Continuous_Underline = 0xFE30;
    int RFB_ISO_Discontinuous_Underline = 0xFE31;
    int RFB_ISO_Emphasize = 0xFE32;
    int RFB_ISO_Center_Object = 0xFE33;
    int RFB_ISO_Enter = 0xFE34;
    int RFB_dead_grave = 0xFE50;
    int RFB_dead_acute = 0xFE51;
    int RFB_dead_circumflex = 0xFE52;
    int RFB_dead_tilde = 0xFE53;
    int RFB_dead_macron = 0xFE54;
    int RFB_dead_breve = 0xFE55;
    int RFB_dead_abovedot = 0xFE56;
    int RFB_dead_diaeresis = 0xFE57;
    int RFB_dead_abovering = 0xFE58;
    int RFB_dead_doubleacute = 0xFE59;
    int RFB_dead_caron = 0xFE5A;
    int RFB_dead_cedilla = 0xFE5B;
    int RFB_dead_ogonek = 0xFE5C;
    int RFB_dead_iota = 0xFE5D;
    int RFB_dead_voiced_sound = 0xFE5E;
    int RFB_dead_semivoiced_sound = 0xFE5F;
    int RFB_dead_belowdot = 0xFE60;
    int RFB_First_Virtual_Screen = 0xFED0;
    int RFB_Prev_Virtual_Screen = 0xFED1;
    int RFB_Next_Virtual_Screen = 0xFED2;
    int RFB_Last_Virtual_Screen = 0xFED4;
    int RFB_Terminate_Server = 0xFED5;
    int RFB_AccessX_Enable = 0xFE70;
    int RFB_AccessX_Feedback_Enable = 0xFE71;
    int RFB_RepeatKeys_Enable = 0xFE72;
    int RFB_SlowKeys_Enable = 0xFE73;
    int RFB_BounceKeys_Enable = 0xFE74;
    int RFB_StickyKeys_Enable = 0xFE75;
    int RFB_MouseKeys_Enable = 0xFE76;
    int RFB_MouseKeys_Accel_Enable = 0xFE77;
    int RFB_Overlay1_Enable = 0xFE78;
    int RFB_Overlay2_Enable = 0xFE79;
    int RFB_AudibleBell_Enable = 0xFE7A;
    int RFB_Pointer_Left = 0xFEE0;
    int RFB_Pointer_Right = 0xFEE1;
    int RFB_Pointer_Up = 0xFEE2;
    int RFB_Pointer_Down = 0xFEE3;
    int RFB_Pointer_UpLeft = 0xFEE4;
    int RFB_Pointer_UpRight = 0xFEE5;
    int RFB_Pointer_DownLeft = 0xFEE6;
    int RFB_Pointer_DownRight = 0xFEE7;
    int RFB_Pointer_Button_Dflt = 0xFEE8;
    int RFB_Pointer_Button1 = 0xFEE9;
    int RFB_Pointer_Button2 = 0xFEEA;
    int RFB_Pointer_Button3 = 0xFEEB;
    int RFB_Pointer_Button4 = 0xFEEC;
    int RFB_Pointer_Button5 = 0xFEED;
    int RFB_Pointer_DblClick_Dflt = 0xFEEE;
    int RFB_Pointer_DblClick1 = 0xFEEF;
    int RFB_Pointer_DblClick2 = 0xFEF0;
    int RFB_Pointer_DblClick3 = 0xFEF1;
    int RFB_Pointer_DblClick4 = 0xFEF2;
    int RFB_Pointer_DblClick5 = 0xFEF3;
    int RFB_Pointer_Drag_Dflt = 0xFEF4;
    int RFB_Pointer_Drag1 = 0xFEF5;
    int RFB_Pointer_Drag2 = 0xFEF6;
    int RFB_Pointer_Drag3 = 0xFEF7;
    int RFB_Pointer_Drag4 = 0xFEF8;
    int RFB_Pointer_Drag5 = 0xFEFD;
    int RFB_Pointer_EnableKeys = 0xFEF9;
    int RFB_Pointer_Accelerate = 0xFEFA;
    int RFB_Pointer_DfltBtnNext = 0xFEFB;
    int RFB_Pointer_DfltBtnPrev = 0xFEFC;
    int RFB_space = 0x020;
    int RFB_exclam = 0x021;
    int RFB_quotedbl = 0x022;
    int RFB_numbersign = 0x023;
    int RFB_dollar = 0x024;
    int RFB_percent = 0x025;
    int RFB_ampersand = 0x026;
    int RFB_apostrophe = 0x027;
    int RFB_quoteright = 0x027 /* deprecated */;
    int RFB_parenleft = 0x028;
    int RFB_parenright = 0x029;
    int RFB_asterisk = 0x02a;
    int RFB_plus = 0x02b;
    int RFB_comma = 0x02c;
    int RFB_minus = 0x02d;
    int RFB_period = 0x02e;
    int RFB_slash = 0x02f;
    int RFB_0 = 0x030;
    int RFB_1 = 0x031;
    int RFB_2 = 0x032;
    int RFB_3 = 0x033;
    int RFB_4 = 0x034;
    int RFB_5 = 0x035;
    int RFB_6 = 0x036;
    int RFB_7 = 0x037;
    int RFB_8 = 0x038;
    int RFB_9 = 0x039;
    int RFB_colon = 0x03a;
    int RFB_semicolon = 0x03b;
    int RFB_less = 0x03c;
    int RFB_equal = 0x03d;
    int RFB_greater = 0x03e;
    int RFB_question = 0x03f;
    int RFB_at = 0x040;
    int RFB_A = 0x041;
    int RFB_B = 0x042;
    int RFB_C = 0x043;
    int RFB_D = 0x044;
    int RFB_E = 0x045;
    int RFB_F = 0x046;
    int RFB_G = 0x047;
    int RFB_H = 0x048;
    int RFB_I = 0x049;
    int RFB_J = 0x04a;
    int RFB_K = 0x04b;
    int RFB_L = 0x04c;
    int RFB_M = 0x04d;
    int RFB_N = 0x04e;
    int RFB_O = 0x04f;
    int RFB_P = 0x050;
    int RFB_Q = 0x051;
    int RFB_R = 0x052;
    int RFB_S = 0x053;
    int RFB_T = 0x054;
    int RFB_U = 0x055;
    int RFB_V = 0x056;
    int RFB_W = 0x057;
    int RFB_X = 0x058;
    int RFB_Y = 0x059;
    int RFB_Z = 0x05a;
    int RFB_bracketleft = 0x05b;
    int RFB_backslash = 0x05c;
    int RFB_bracketright = 0x05d;
    int RFB_asciicircum = 0x05e;
    int RFB_underscore = 0x05f;
    int RFB_grave = 0x060;
    int RFB_quoteleft = 0x060 /* deprecated */;
    int RFB_a = 0x061;
    int RFB_b = 0x062;
    int RFB_c = 0x063;
    int RFB_d = 0x064;
    int RFB_e = 0x065;
    int RFB_f = 0x066;
    int RFB_g = 0x067;
    int RFB_h = 0x068;
    int RFB_i = 0x069;
    int RFB_j = 0x06a;
    int RFB_k = 0x06b;
    int RFB_l = 0x06c;
    int RFB_m = 0x06d;
    int RFB_n = 0x06e;
    int RFB_o = 0x06f;
    int RFB_p = 0x070;
    int RFB_q = 0x071;
    int RFB_r = 0x072;
    int RFB_s = 0x073;
    int RFB_t = 0x074;
    int RFB_u = 0x075;
    int RFB_v = 0x076;
    int RFB_w = 0x077;
    int RFB_x = 0x078;
    int RFB_y = 0x079;
    int RFB_z = 0x07a;
    int RFB_braceleft = 0x07b;
    int RFB_bar = 0x07c;
    int RFB_braceright = 0x07d;
    int RFB_asciitilde = 0x07e;
    int RFB_nobreakspace = 0x0a0;
    int RFB_exclamdown = 0x0a1;
    int RFB_cent = 0x0a2;
    int RFB_sterling = 0x0a3;
    int RFB_currency = 0x0a4;
    int RFB_yen = 0x0a5;
    int RFB_brokenbar = 0x0a6;
    int RFB_section = 0x0a7;
    int RFB_diaeresis = 0x0a8;
    int RFB_copyright = 0x0a9;
    int RFB_ordfeminine = 0x0aa;
    int RFB_guillemotleft = 0x0ab /* left angle quotation mark */;
    int RFB_notsign = 0x0ac;
    int RFB_hyphen = 0x0ad;
    int RFB_registered = 0x0ae;
    int RFB_macron = 0x0af;
    int RFB_degree = 0x0b0;
    int RFB_plusminus = 0x0b1;
    int RFB_twosuperior = 0x0b2;
    int RFB_threesuperior = 0x0b3;
    int RFB_acute = 0x0b4;
    int RFB_mu = 0x0b5;
    int RFB_paragraph = 0x0b6;
    int RFB_periodcentered = 0x0b7;
    int RFB_cedilla = 0x0b8;
    int RFB_onesuperior = 0x0b9;
    int RFB_masculine = 0x0ba;
    int RFB_guillemotright = 0x0bb /* right angle quotation mark */;
    int RFB_onequarter = 0x0bc;
    int RFB_onehalf = 0x0bd;
    int RFB_threequarters = 0x0be;
    int RFB_questiondown = 0x0bf;
    int RFB_Agrave = 0x0c0;
    int RFB_Aacute = 0x0c1;
    int RFB_Acircumflex = 0x0c2;
    int RFB_Atilde = 0x0c3;
    int RFB_Adiaeresis = 0x0c4;
    int RFB_Aring = 0x0c5;
    int RFB_AE = 0x0c6;
    int RFB_Ccedilla = 0x0c7;
    int RFB_Egrave = 0x0c8;
    int RFB_Eacute = 0x0c9;
    int RFB_Ecircumflex = 0x0ca;
    int RFB_Ediaeresis = 0x0cb;
    int RFB_Igrave = 0x0cc;
    int RFB_Iacute = 0x0cd;
    int RFB_Icircumflex = 0x0ce;
    int RFB_Idiaeresis = 0x0cf;
    int RFB_ETH = 0x0d0;
    int RFB_Eth = 0x0d0 /* deprecated */;
    int RFB_Ntilde = 0x0d1;
    int RFB_Ograve = 0x0d2;
    int RFB_Oacute = 0x0d3;
    int RFB_Ocircumflex = 0x0d4;
    int RFB_Otilde = 0x0d5;
    int RFB_Odiaeresis = 0x0d6;
    int RFB_multiply = 0x0d7;
    int RFB_Ooblique = 0x0d8;
    int RFB_Ugrave = 0x0d9;
    int RFB_Uacute = 0x0da;
    int RFB_Ucircumflex = 0x0db;
    int RFB_Udiaeresis = 0x0dc;
    int RFB_Yacute = 0x0dd;
    int RFB_THORN = 0x0de;
    int RFB_Thorn = 0x0de /* deprecated */;
    int RFB_ssharp = 0x0df;
    int RFB_agrave = 0x0e0;
    int RFB_aacute = 0x0e1;
    int RFB_acircumflex = 0x0e2;
    int RFB_atilde = 0x0e3;
    int RFB_adiaeresis = 0x0e4;
    int RFB_aring = 0x0e5;
    int RFB_ae = 0x0e6;
    int RFB_ccedilla = 0x0e7;
    int RFB_egrave = 0x0e8;
    int RFB_eacute = 0x0e9;
    int RFB_ecircumflex = 0x0ea;
    int RFB_ediaeresis = 0x0eb;
    int RFB_igrave = 0x0ec;
    int RFB_iacute = 0x0ed;
    int RFB_icircumflex = 0x0ee;
    int RFB_idiaeresis = 0x0ef;
    int RFB_eth = 0x0f0;
    int RFB_ntilde = 0x0f1;
    int RFB_ograve = 0x0f2;
    int RFB_oacute = 0x0f3;
    int RFB_ocircumflex = 0x0f4;
    int RFB_otilde = 0x0f5;
    int RFB_odiaeresis = 0x0f6;
    int RFB_division = 0x0f7;
    int RFB_oslash = 0x0f8;
    int RFB_ugrave = 0x0f9;
    int RFB_uacute = 0x0fa;
    int RFB_ucircumflex = 0x0fb;
    int RFB_udiaeresis = 0x0fc;
    int RFB_yacute = 0x0fd;
    int RFB_thorn = 0x0fe;
    int RFB_ydiaeresis = 0x0ff;
    int RFB_Aogonek = 0x1a1;
    int RFB_breve = 0x1a2;
    int RFB_Lstroke = 0x1a3;
    int RFB_Lcaron = 0x1a5;
    int RFB_Sacute = 0x1a6;
    int RFB_Scaron = 0x1a9;
    int RFB_Scedilla = 0x1aa;
    int RFB_Tcaron = 0x1ab;
    int RFB_Zacute = 0x1ac;
    int RFB_Zcaron = 0x1ae;
    int RFB_Zabovedot = 0x1af;
    int RFB_aogonek = 0x1b1;
    int RFB_ogonek = 0x1b2;
    int RFB_lstroke = 0x1b3;
    int RFB_lcaron = 0x1b5;
    int RFB_sacute = 0x1b6;
    int RFB_caron = 0x1b7;
    int RFB_scaron = 0x1b9;
    int RFB_scedilla = 0x1ba;
    int RFB_tcaron = 0x1bb;
    int RFB_zacute = 0x1bc;
    int RFB_doubleacute = 0x1bd;
    int RFB_zcaron = 0x1be;
    int RFB_zabovedot = 0x1bf;
    int RFB_Racute = 0x1c0;
    int RFB_Abreve = 0x1c3;
    int RFB_Lacute = 0x1c5;
    int RFB_Cacute = 0x1c6;
    int RFB_Ccaron = 0x1c8;
    int RFB_Eogonek = 0x1ca;
    int RFB_Ecaron = 0x1cc;
    int RFB_Dcaron = 0x1cf;
    int RFB_Dstroke = 0x1d0;
    int RFB_Nacute = 0x1d1;
    int RFB_Ncaron = 0x1d2;
    int RFB_Odoubleacute = 0x1d5;
    int RFB_Rcaron = 0x1d8;
    int RFB_Uring = 0x1d9;
    int RFB_Udoubleacute = 0x1db;
    int RFB_Tcedilla = 0x1de;
    int RFB_racute = 0x1e0;
    int RFB_abreve = 0x1e3;
    int RFB_lacute = 0x1e5;
    int RFB_cacute = 0x1e6;
    int RFB_ccaron = 0x1e8;
    int RFB_eogonek = 0x1ea;
    int RFB_ecaron = 0x1ec;
    int RFB_dcaron = 0x1ef;
    int RFB_dstroke = 0x1f0;
    int RFB_nacute = 0x1f1;
    int RFB_ncaron = 0x1f2;
    int RFB_odoubleacute = 0x1f5;
    int RFB_udoubleacute = 0x1fb;
    int RFB_rcaron = 0x1f8;
    int RFB_uring = 0x1f9;
    int RFB_tcedilla = 0x1fe;
    int RFB_abovedot = 0x1ff;
    int RFB_Hstroke = 0x2a1;
    int RFB_Hcircumflex = 0x2a6;
    int RFB_Iabovedot = 0x2a9;
    int RFB_Gbreve = 0x2ab;
    int RFB_Jcircumflex = 0x2ac;
    int RFB_hstroke = 0x2b1;
    int RFB_hcircumflex = 0x2b6;
    int RFB_idotless = 0x2b9;
    int RFB_gbreve = 0x2bb;
    int RFB_jcircumflex = 0x2bc;
    int RFB_Cabovedot = 0x2c5;
    int RFB_Ccircumflex = 0x2c6;
    int RFB_Gabovedot = 0x2d5;
    int RFB_Gcircumflex = 0x2d8;
    int RFB_Ubreve = 0x2dd;
    int RFB_Scircumflex = 0x2de;
    int RFB_cabovedot = 0x2e5;
    int RFB_ccircumflex = 0x2e6;
    int RFB_gabovedot = 0x2f5;
    int RFB_gcircumflex = 0x2f8;
    int RFB_ubreve = 0x2fd;
    int RFB_scircumflex = 0x2fe;
    int RFB_kra = 0x3a2;
    int RFB_kappa = 0x3a2 /* deprecated */;
    int RFB_Rcedilla = 0x3a3;
    int RFB_Itilde = 0x3a5;
    int RFB_Lcedilla = 0x3a6;
    int RFB_Emacron = 0x3aa;
    int RFB_Gcedilla = 0x3ab;
    int RFB_Tslash = 0x3ac;
    int RFB_rcedilla = 0x3b3;
    int RFB_itilde = 0x3b5;
    int RFB_lcedilla = 0x3b6;
    int RFB_emacron = 0x3ba;
    int RFB_gcedilla = 0x3bb;
    int RFB_tslash = 0x3bc;
    int RFB_ENG = 0x3bd;
    int RFB_eng = 0x3bf;
    int RFB_Amacron = 0x3c0;
    int RFB_Iogonek = 0x3c7;
    int RFB_Eabovedot = 0x3cc;
    int RFB_Imacron = 0x3cf;
    int RFB_Ncedilla = 0x3d1;
    int RFB_Omacron = 0x3d2;
    int RFB_Kcedilla = 0x3d3;
    int RFB_Uogonek = 0x3d9;
    int RFB_Utilde = 0x3dd;
    int RFB_Umacron = 0x3de;
    int RFB_amacron = 0x3e0;
    int RFB_iogonek = 0x3e7;
    int RFB_eabovedot = 0x3ec;
    int RFB_imacron = 0x3ef;
    int RFB_ncedilla = 0x3f1;
    int RFB_omacron = 0x3f2;
    int RFB_kcedilla = 0x3f3;
    int RFB_uogonek = 0x3f9;
    int RFB_utilde = 0x3fd;
    int RFB_umacron = 0x3fe;
    int RFB_Greek_ALPHAaccent = 0x7a1;
    int RFB_Greek_EPSILONaccent = 0x7a2;
    int RFB_Greek_ETAaccent = 0x7a3;
    int RFB_Greek_IOTAaccent = 0x7a4;
    int RFB_Greek_IOTAdieresis = 0x7a5;
    int RFB_Greek_OMICRONaccent = 0x7a7;
    int RFB_Greek_UPSILONaccent = 0x7a8;
    int RFB_Greek_UPSILONdieresis = 0x7a9;
    int RFB_Greek_OMEGAaccent = 0x7ab;
    int RFB_Greek_accentdieresis = 0x7ae;
    int RFB_Greek_horizbar = 0x7af;
    int RFB_Greek_alphaaccent = 0x7b1;
    int RFB_Greek_epsilonaccent = 0x7b2;
    int RFB_Greek_etaaccent = 0x7b3;
    int RFB_Greek_iotaaccent = 0x7b4;
    int RFB_Greek_iotadieresis = 0x7b5;
    int RFB_Greek_iotaaccentdieresis = 0x7b6;
    int RFB_Greek_omicronaccent = 0x7b7;
    int RFB_Greek_upsilonaccent = 0x7b8;
    int RFB_Greek_upsilondieresis = 0x7b9;
    int RFB_Greek_upsilonaccentdieresis = 0x7ba;
    int RFB_Greek_omegaaccent = 0x7bb;
    int RFB_Greek_ALPHA = 0x7c1;
    int RFB_Greek_BETA = 0x7c2;
    int RFB_Greek_GAMMA = 0x7c3;
    int RFB_Greek_DELTA = 0x7c4;
    int RFB_Greek_EPSILON = 0x7c5;
    int RFB_Greek_ZETA = 0x7c6;
    int RFB_Greek_ETA = 0x7c7;
    int RFB_Greek_THETA = 0x7c8;
    int RFB_Greek_IOTA = 0x7c9;
    int RFB_Greek_KAPPA = 0x7ca;
    int RFB_Greek_LAMDA = 0x7cb;
    int RFB_Greek_LAMBDA = 0x7cb;
    int RFB_Greek_MU = 0x7cc;
    int RFB_Greek_NU = 0x7cd;
    int RFB_Greek_XI = 0x7ce;
    int RFB_Greek_OMICRON = 0x7cf;
    int RFB_Greek_PI = 0x7d0;
    int RFB_Greek_RHO = 0x7d1;
    int RFB_Greek_SIGMA = 0x7d2;
    int RFB_Greek_TAU = 0x7d4;
    int RFB_Greek_UPSILON = 0x7d5;
    int RFB_Greek_PHI = 0x7d6;
    int RFB_Greek_CHI = 0x7d7;
    int RFB_Greek_PSI = 0x7d8;
    int RFB_Greek_OMEGA = 0x7d9;
    int RFB_Greek_alpha = 0x7e1;
    int RFB_Greek_beta = 0x7e2;
    int RFB_Greek_gamma = 0x7e3;
    int RFB_Greek_delta = 0x7e4;
    int RFB_Greek_epsilon = 0x7e5;
    int RFB_Greek_zeta = 0x7e6;
    int RFB_Greek_eta = 0x7e7;
    int RFB_Greek_theta = 0x7e8;
    int RFB_Greek_iota = 0x7e9;
    int RFB_Greek_kappa = 0x7ea;
    int RFB_Greek_lamda = 0x7eb;
    int RFB_Greek_lambda = 0x7eb;
    int RFB_Greek_mu = 0x7ec;
    int RFB_Greek_nu = 0x7ed;
    int RFB_Greek_xi = 0x7ee;
    int RFB_Greek_omicron = 0x7ef;
    int RFB_Greek_pi = 0x7f0;
    int RFB_Greek_rho = 0x7f1;
    int RFB_Greek_sigma = 0x7f2;
    int RFB_Greek_finalsmallsigma = 0x7f3;
    int RFB_Greek_tau = 0x7f4;
    int RFB_Greek_upsilon = 0x7f5;
    int RFB_Greek_phi = 0x7f6;
    int RFB_Greek_chi = 0x7f7;
    int RFB_Greek_psi = 0x7f8;
    int RFB_Greek_omega = 0x7f9;
    int RFB_Greek_switch = 0xFF7E /* Alias for mode_switch */;
    int RFB_EuroSign = 0x20ac;
}
