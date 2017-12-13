package ru.itis;

import java.time.LocalTime;

public class TelevisionSet {

        private static final TelevisionSet instance;

        private TelevisionSet() {

        }

        static {
            instance = new TelevisionSet();
        }

        public static TelevisionSet getInstance() {
            return instance;
        }


        static class Channel {
            static class Programs {
                String programName;
                LocalTime theBeginning;
                LocalTime theEnd;
            }
            String channelName;
            Programs programList[] = new Programs[4];
        }

        Channel channel[] = new Channel[5];
        int channelOn = 0;



    }
