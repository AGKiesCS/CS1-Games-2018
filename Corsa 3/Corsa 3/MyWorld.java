import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Connor Hayes and James Barham
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    int score =  0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 550, 1); 
        //prepare();
        prepare();
    }

    public void counter()
    {
        score = score+1;
        showText( "The score is " + score, 50, 50);
    }   

    public void act(){

    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Blocks blocks = new Blocks();
        addObject(blocks,825,343);
        Blocks blocks2 = new Blocks();
        addObject(blocks2,823,239);
        Blocks blocks3 = new Blocks();
        addObject(blocks3,813,141);
        Blocks blocks4 = new Blocks();
        addObject(blocks4,811,82);
        Blocks blocks5 = new Blocks();
        addObject(blocks5,807,16);
        Blocks blocks6 = new Blocks();
        addObject(blocks6,743,24);
        Blocks blocks7 = new Blocks();
        addObject(blocks7,641,21);
        Blocks blocks8 = new Blocks();
        addObject(blocks8,537,8);
        Blocks blocks9 = new Blocks();
        addObject(blocks9,498,18);
        Blocks blocks10 = new Blocks();
        addObject(blocks10,652,68);
        removeObject(blocks10);
        Blocks blocks11 = new Blocks();
        addObject(blocks11,676,151);
        Blocks blocks12 = new Blocks();
        addObject(blocks12,672,192);
        Blocks blocks13 = new Blocks();
        addObject(blocks13,683,233);
        Blocks blocks14 = new Blocks();
        addObject(blocks14,687,272);
        Blocks blocks15 = new Blocks();
        addObject(blocks15,686,319);
        Blocks blocks16 = new Blocks();
        addObject(blocks16,681,368);
        Blocks blocks17 = new Blocks();
        addObject(blocks17,478,65);
        Blocks blocks18 = new Blocks();
        addObject(blocks18,478,114);
        Blocks blocks19 = new Blocks();
        addObject(blocks19,475,155);
        Blocks blocks20 = new Blocks();
        addObject(blocks20,478,192);
        Blocks blocks21 = new Blocks();
        addObject(blocks21,489,242);
        Blocks blocks22 = new Blocks();
        addObject(blocks22,492,286);
        Blocks blocks23 = new Blocks();
        addObject(blocks23,625,392);
        Blocks blocks24 = new Blocks();
        addObject(blocks24,548,388);
        Blocks blocks25 = new Blocks();
        addObject(blocks25,494,392);
        Blocks blocks26 = new Blocks();
        addObject(blocks26,455,391);
        Blocks blocks27 = new Blocks();
        addObject(blocks27,407,393);
        Blocks blocks28 = new Blocks();
        addObject(blocks28,371,397);
        Blocks blocks29 = new Blocks();
        addObject(blocks29,306,359);
        Blocks blocks30 = new Blocks();
        addObject(blocks30,299,315);
        Blocks blocks31 = new Blocks();
        addObject(blocks31,304,268);
        Blocks blocks32 = new Blocks();
        addObject(blocks32,308,226);
        Blocks blocks33 = new Blocks();
        addObject(blocks33,310,168);
        Blocks blocks34 = new Blocks();
        addObject(blocks34,310,163);
        Blocks blocks35 = new Blocks();
        addObject(blocks35,413,28);
        Blocks blocks36 = new Blocks();
        addObject(blocks36,362,28);
        Blocks blocks37 = new Blocks();
        addObject(blocks37,295,27);
        Blocks blocks38 = new Blocks();
        addObject(blocks38,223,25);
        Blocks blocks39 = new Blocks();
        addObject(blocks39,159,23);
        Blocks blocks40 = new Blocks();
        addObject(blocks40,94,28);
        Blocks blocks41 = new Blocks();
        addObject(blocks41,48,44);
        Blocks blocks42 = new Blocks();
        addObject(blocks42,47,119);
        Blocks blocks43 = new Blocks();
        addObject(blocks43,54,168);
        Blocks blocks44 = new Blocks();
        addObject(blocks44,54,206);
        Blocks blocks45 = new Blocks();
        addObject(blocks45,51,236);
        Blocks blocks46 = new Blocks();
        addObject(blocks46,42,335);
        Blocks blocks47 = new Blocks();
        addObject(blocks47,44,413);
        Blocks blocks48 = new Blocks();
        addObject(blocks48,39,512);
        Blocks blocks49 = new Blocks();
        addObject(blocks49,41,530);
        Blocks blocks50 = new Blocks();
        addObject(blocks50,278,157);
        Blocks blocks51 = new Blocks();
        addObject(blocks51,225,173);
        Blocks blocks52 = new Blocks();
        addObject(blocks52,203,170);
        Blocks blocks53 = new Blocks();
        addObject(blocks53,168,168);
        Blocks blocks54 = new Blocks();
        addObject(blocks54,89,297);
        Blocks blocks55 = new Blocks();
        addObject(blocks55,148,283);
        Blocks blocks56 = new Blocks();
        addObject(blocks56,179,293);
        removeObject(blocks55);
        removeObject(blocks56);
        removeObject(blocks54);
        Blocks blocks57 = new Blocks();
        addObject(blocks57,76,287);
        Blocks blocks58 = new Blocks();
        addObject(blocks58,107,292);
        Blocks blocks59 = new Blocks();
        addObject(blocks59,142,291);
        Blocks blocks60 = new Blocks();
        addObject(blocks60,166,294);
        Blocks blocks61 = new Blocks();
        addObject(blocks61,307,407);
        Blocks blocks62 = new Blocks();
        addObject(blocks62,306,451);
        Blocks blocks63 = new Blocks();
        addObject(blocks63,278,423);
        Blocks blocks64 = new Blocks();
        addObject(blocks64,215,422);
        Blocks blocks65 = new Blocks();
        addObject(blocks65,178,421);
        removeObject(blocks62);
        removeObject(blocks63);
        removeObject(blocks64);
        removeObject(blocks65);
        Blocks blocks66 = new Blocks();
        addObject(blocks66,275,406);
        Blocks blocks67 = new Blocks();
        addObject(blocks67,244,415);
        Blocks blocks68 = new Blocks();
        addObject(blocks68,219,413);
        Blocks blocks69 = new Blocks();
        addObject(blocks69,104,536);
        Blocks blocks70 = new Blocks();
        addObject(blocks70,140,545);
        Blocks blocks71 = new Blocks();
        addObject(blocks71,166,541);
        Blocks blocks72 = new Blocks();
        addObject(blocks72,197,547);
        Blocks blocks73 = new Blocks();
        addObject(blocks73,234,547);
        Blocks blocks74 = new Blocks();
        addObject(blocks74,262,538);
        Blocks blocks75 = new Blocks();
        addObject(blocks75,281,539);
        Blocks blocks76 = new Blocks();
        addObject(blocks76,301,539);
        Blocks blocks77 = new Blocks();
        addObject(blocks77,332,539);
        Blocks blocks78 = new Blocks();
        addObject(blocks78,354,539);
        Blocks blocks79 = new Blocks();
        addObject(blocks79,383,543);
        Blocks blocks80 = new Blocks();
        addObject(blocks80,417,544);
        Blocks blocks81 = new Blocks();
        addObject(blocks81,437,540);
        Blocks blocks82 = new Blocks();
        addObject(blocks82,469,539);
        Blocks blocks83 = new Blocks();
        addObject(blocks83,489,538);
        Blocks blocks84 = new Blocks();
        addObject(blocks84,520,540);
        Blocks blocks85 = new Blocks();
        addObject(blocks85,571,542);
        Blocks blocks86 = new Blocks();
        addObject(blocks86,584,541);
        Blocks blocks87 = new Blocks();
        addObject(blocks87,617,543);
        Blocks blocks88 = new Blocks();
        addObject(blocks88,675,548);
        Blocks blocks89 = new Blocks();
        addObject(blocks89,699,549);
        Blocks blocks90 = new Blocks();
        addObject(blocks90,754,541);
        Blocks blocks91 = new Blocks();
        addObject(blocks91,779,543);
        Blocks blocks92 = new Blocks();
        addObject(blocks92,804,543);
        Blocks blocks93 = new Blocks();
        addObject(blocks93,819,538);
        Blocks blocks94 = new Blocks();
        addObject(blocks94,830,521);
        Blocks blocks95 = new Blocks();
        addObject(blocks95,830,497);
        Blocks blocks96 = new Blocks();
        addObject(blocks96,824,453);
        Blocks blocks97 = new Blocks();
        addObject(blocks97,824,416);
        Blocks blocks98 = new Blocks();
        addObject(blocks98,824,374);
        blocks68.setLocation(193,414);
        blocks67.setLocation(233,407);
        blocks57.setLocation(53,289);
        blocks58.setLocation(103,289);
        blocks59.setLocation(136,293);
        blocks60.setLocation(166,295);
        blocks46.setLocation(52,344);
        blocks47.setLocation(53,384);
        blocks46.setLocation(50,340);
        blocks47.setLocation(51,378);
        blocks48.setLocation(46,427);
        blocks49.setLocation(43,466);
        blocks69.setLocation(41,506);
        blocks70.setLocation(84,535);
        blocks49.setLocation(48,468);
        blocks71.setLocation(141,535);
        blocks72.setLocation(178,529);
        blocks72.setLocation(183,537);
        blocks73.setLocation(218,537);
        blocks74.setLocation(254,540);
        Blocks blocks99 = new Blocks();
        addObject(blocks99,828,308);
        Blocks blocks100 = new Blocks();
        addObject(blocks100,830,279);
        Blocks blocks101 = new Blocks();
        addObject(blocks101,822,208);
        Blocks blocks102 = new Blocks();
        addObject(blocks102,822,179);
        Blocks blocks103 = new Blocks();
        addObject(blocks103,580,17);
        Blocks blocks104 = new Blocks();
        addObject(blocks104,613,19);
        Blocks blocks105 = new Blocks();
        addObject(blocks105,677,18);
        Blocks blocks106 = new Blocks();
        addObject(blocks106,713,20);
        Blocks blocks107 = new Blocks();
        addObject(blocks107,452,23);
        Blocks blocks108 = new Blocks();
        addObject(blocks108,254,22);
        Blocks blocks109 = new Blocks();
        addObject(blocks109,328,28);
        Blocks blocks110 = new Blocks();
        addObject(blocks110,189,24);
        Blocks blocks111 = new Blocks();
        addObject(blocks111,129,24);
        Blocks blocks112 = new Blocks();
        addObject(blocks112,48,83);
        Blocks blocks113 = new Blocks();
        addObject(blocks113,23,533);
        blocks69.setLocation(26,501);
        blocks69.setLocation(24,501);
        blocks49.setLocation(23,466);
        blocks48.setLocation(24,431);
        blocks47.setLocation(30,390);
        blocks47.setLocation(25,394);
        blocks46.setLocation(26,355);
        blocks57.setLocation(28,318);
        blocks45.setLocation(22,280);
        blocks57.setLocation(23,318);
        blocks46.setLocation(24,355);
        blocks44.setLocation(24,242);
        blocks43.setLocation(22,199);
        blocks42.setLocation(24,160);
        blocks43.setLocation(22,201);
        blocks112.setLocation(24,124);
        blocks41.setLocation(24,89);
        Blocks blocks114 = new Blocks();
        addObject(blocks114,24,55);
        Blocks blocks115 = new Blocks();
        addObject(blocks115,27,27);
        blocks40.setLocation(70,25);
        blocks58.setLocation(51,282);
        blocks59.setLocation(90,282);
        blocks60.setLocation(126,277);
        blocks53.setLocation(158,165);
        blocks51.setLocation(235,162);
        blocks52.setLocation(206,163);
        blocks53.setLocation(174,163);
        blocks50.setLocation(269,162);
        removeObject(blocks33);
        blocks32.setLocation(309,196);
        blocks31.setLocation(310,233);
        blocks30.setLocation(311,266);
        blocks29.setLocation(312,303);
        blocks61.setLocation(311,336);
        blocks66.setLocation(311,369);
        blocks67.setLocation(310,405);
        blocks68.setLocation(278,404);
        blocks74.setLocation(240,404);
        blocks73.setLocation(204,402);
        blocks72.setLocation(168,401);
        blocks28.setLocation(345,404);
        blocks27.setLocation(379,403);
        blocks26.setLocation(416,402);
        blocks25.setLocation(464,400);
        blocks25.setLocation(452,402);
        blocks24.setLocation(485,401);
        blocks23.setLocation(524,403);
        blocks83.setLocation(555,402);
        Blocks blocks116 = new Blocks();
        addObject(blocks116,598,407);
        Blocks blocks117 = new Blocks();
        addObject(blocks117,646,412);
        blocks116.setLocation(592,402);
        blocks117.setLocation(634,400);
        Blocks blocks118 = new Blocks();
        addObject(blocks118,688,409);
        blocks11.setLocation(673,127);
        blocks12.setLocation(674,181);
        blocks13.setLocation(672,226);
        blocks14.setLocation(671,272);
        blocks15.setLocation(667,314);
        blocks16.setLocation(667,360);
        blocks118.setLocation(673,398);
        blocks37.setLocation(295,23);
        blocks109.setLocation(331,26);
        blocks35.setLocation(397,31);
        blocks107.setLocation(431,26);
        blocks35.setLocation(397,26);
        blocks36.setLocation(363,24);
        blocks109.setLocation(331,25);
        blocks37.setLocation(296,24);
        blocks9.setLocation(469,28);
        blocks8.setLocation(505,26);
        blocks103.setLocation(543,27);
        blocks104.setLocation(588,28);
        blocks7.setLocation(630,27);
        blocks105.setLocation(662,27);
        blocks106.setLocation(698,27);
        blocks6.setLocation(742,30);
        blocks5.setLocation(777,29);
        blocks4.setLocation(815,30);
        blocks3.setLocation(816,67);
        blocks102.setLocation(816,109);
        blocks101.setLocation(814,155);
        blocks18.setLocation(477,98);
        blocks19.setLocation(478,130);
        blocks20.setLocation(476,165);
        blocks21.setLocation(476,199);
        blocks22.setLocation(473,233);
        blocks22.setLocation(477,236);
        blocks2.setLocation(814,191);
        blocks100.setLocation(813,230);
        blocks99.setLocation(814,269);
        blocks.setLocation(816,312);
        blocks98.setLocation(816,355);
        blocks97.setLocation(818,394);
        blocks96.setLocation(818,428);
        blocks95.setLocation(819,462);
        blocks94.setLocation(820,496);
        removeObject(blocks93);
        blocks92.setLocation(820,528);
        blocks91.setLocation(781,538);
        blocks90.setLocation(753,537);
        blocks89.setLocation(716,536);
        blocks88.setLocation(678,535);
        blocks87.setLocation(641,535);
        blocks86.setLocation(604,534);
        blocks85.setLocation(566,536);
        blocks86.setLocation(603,541);
        blocks87.setLocation(643,541);
        blocks88.setLocation(680,539);
        blocks89.setLocation(718,542);
        blocks85.setLocation(569,540);
        blocks84.setLocation(533,541);
        blocks82.setLocation(499,542);
        blocks81.setLocation(464,542);
        blocks80.setLocation(424,543);
        blocks79.setLocation(389,540);
        blocks75.setLocation(206,542);
        blocks76.setLocation(249,542);
        blocks77.setLocation(298,541);
        blocks78.setLocation(350,539);
        blocks78.setLocation(347,545);
        blocks77.setLocation(297,546);
        blocks71.setLocation(137,541);
        blocks70.setLocation(68,543);
        blocks71.setLocation(114,544);
        Blocks blocks119 = new Blocks();
        addObject(blocks119,159,543);
        blocks119.setLocation(154,541);
        blocks75.setLocation(201,540);
        blocks76.setLocation(252,540);
        blocks75.setLocation(205,545);
        blocks76.setLocation(254,545);
        blocks77.setLocation(299,544);
        blocks78.setLocation(347,540);
        blocks79.setLocation(391,541);
        blocks80.setLocation(430,542);
        blocks91.setLocation(788,536);
        blocks89.setLocation(717,535);
        blocks88.setLocation(680,535);
        blocks87.setLocation(643,534);
        blocks86.setLocation(611,534);
        blocks85.setLocation(572,530);
        blocks85.setLocation(573,536);
        blocks84.setLocation(532,535);
        blocks82.setLocation(499,532);
        blocks81.setLocation(465,531);
        blocks80.setLocation(430,533);
        blocks79.setLocation(391,534);
        blocks78.setLocation(348,538);
        blocks77.setLocation(305,531);
        blocks78.setLocation(351,535);
        blocks77.setLocation(313,537);
        blocks76.setLocation(274,536);
        blocks75.setLocation(240,536);
        blocks119.setLocation(202,534);
        blocks71.setLocation(164,534);
        blocks70.setLocation(134,533);
        Blocks blocks120 = new Blocks();
        addObject(blocks120,105,540);
        Blocks blocks121 = new Blocks();
        addObject(blocks121,64,540);
        blocks120.setLocation(96,533);
        blocks121.setLocation(60,535);
        blocks60.setLocation(127,281);
        Blocks blocks122 = new Blocks();
        addObject(blocks122,674,155);
        blocks58.setLocation(61,281);
        blocks58.setLocation(53,279);
        blocks58.setLocation(55,282);
        blocks59.setLocation(90,279);
        blocks60.setLocation(125,277);
        Blocks blocks123 = new Blocks();
        addObject(blocks123,166,283);
        blocks60.setLocation(127,282);
        blocks59.setLocation(89,281);
        blocks23.setLocation(518,402);
        blocks83.setLocation(556,402);
        blocks116.setLocation(594,404);
        blocks117.setLocation(634,403);
        blocks118.setLocation(670,400);
        blocks16.setLocation(668,362);
        blocks15.setLocation(668,325);
        blocks14.setLocation(668,286);
        blocks13.setLocation(667,245);
        blocks12.setLocation(667,206);
        blocks122.setLocation(663,164);
        blocks11.setLocation(663,132);
        blocks122.setLocation(664,172);
        blocks22.setLocation(487,238);
        Blocks blocks124 = new Blocks();
        addObject(blocks124,487,277);
        blocks21.setLocation(488,201);
        blocks20.setLocation(485,166);
        blocks19.setLocation(484,134);
        blocks18.setLocation(483,100);
        blocks17.setLocation(484,66);
        blocks21.setLocation(485,201);
        blocks22.setLocation(485,239);
        blocks124.setLocation(484,274);
        blocks118.setLocation(662,404);
        blocks117.setLocation(629,403);
        blocks16.setLocation(665,367);
        blocks15.setLocation(666,325);
        blocks14.setLocation(665,285);
        blocks13.setLocation(665,245);
        blocks12.setLocation(665,206);
        blocks100.setLocation(823,227);
        blocks99.setLocation(823,269);
        blocks.setLocation(823,311);
        blocks98.setLocation(824,352);
        blocks97.setLocation(823,393);
        blocks96.setLocation(824,429);
        blocks95.setLocation(824,461);
        blocks94.setLocation(823,496);
        blocks92.setLocation(824,532);
        blocks94.setLocation(824,496);
        blocks95.setLocation(828,464);
        blocks96.setLocation(827,426);
        blocks97.setLocation(827,389);
        blocks98.setLocation(825,348);
        blocks.setLocation(827,308);
        blocks99.setLocation(826,268);
        blocks100.setLocation(826,226);
        blocks2.setLocation(823,189);
        blocks101.setLocation(825,155);
        blocks2.setLocation(827,191);
        blocks101.setLocation(826,154);
        blocks102.setLocation(827,117);
        blocks3.setLocation(829,80);
        blocks4.setLocation(830,18);
        Blocks blocks125 = new Blocks();
        addObject(blocks125,829,51);
        blocks5.setLocation(788,18);
        blocks6.setLocation(751,15);
        blocks106.setLocation(712,15);
        blocks105.setLocation(679,15);
        blocks7.setLocation(646,14);
        blocks104.setLocation(609,15);
        blocks103.setLocation(575,13);
        blocks8.setLocation(537,15);
        blocks9.setLocation(506,17);
        Blocks blocks126 = new Blocks();
        addObject(blocks126,476,18);
        Blocks blocks127 = new Blocks();
        addObject(blocks127,483,48);
        blocks17.setLocation(483,76);
        blocks18.setLocation(483,107);
        blocks107.setLocation(436,16);
        blocks35.setLocation(397,18);
        blocks36.setLocation(362,18);
        blocks109.setLocation(327,21);
        blocks37.setLocation(292,20);
        blocks108.setLocation(257,18);
        blocks38.setLocation(221,20);
        blocks110.setLocation(188,18);
        blocks110.setLocation(187,21);
        blocks39.setLocation(159,20);
        blocks111.setLocation(129,20);
        Blocks blocks128 = new Blocks();
        addObject(blocks128,99,24);
        blocks40.setLocation(67,21);
        blocks128.setLocation(99,21);
        blocks115.setLocation(26,22);
        blocks72.setLocation(169,408);
        blocks73.setLocation(206,408);
        blocks74.setLocation(244,407);
        blocks68.setLocation(278,408);
        blocks67.setLocation(312,407);
        blocks28.setLocation(348,407);
        blocks25.setLocation(454,403);
        blocks24.setLocation(486,403);
        blocks26.setLocation(416,405);
        blocks27.setLocation(381,408);
    }
}

