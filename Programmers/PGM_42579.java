package Programmers;

import java.util.*;

public class PGM_42579 {

    private class Music{
        private final int idx;
        private final String genre;
        private final int count;

        private Music(int idx, String genre, int count){
            this.idx = idx;
            this.genre = genre;
            this.count = count;
        }
        @Override
        public String toString() {
            return "Music{" +
                    "idx=" + idx +
                    ", genre='" + genre + '\'' +
                    ", count=" + count +
                    '}';
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genresMap = calculateGenresMap(genres, plays);
        List<String> orderedGenre = orderGenres(genresMap);
        List<Music> result = getTopTwoMusics(genres, plays, orderedGenre);
        return result.stream().mapToInt(r -> r.idx).toArray();
    }

    private HashMap<String, Integer> calculateGenresMap(String[] genres, int[] plays) {
        HashMap<String, Integer> genresMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        return genresMap;
    }

    private List<String> orderGenres(HashMap<String, Integer> genresMap) {
        List<String> orderedGenre = new ArrayList<>();
        while (!genresMap.isEmpty()) {
            String maxKey = findMaxKey(genresMap);
            orderedGenre.add(maxKey);
            genresMap.remove(maxKey);
        }
        return orderedGenre;
    }

    private String findMaxKey(HashMap<String, Integer> genresMap) {
        int maxCount = Integer.MIN_VALUE;
        String maxKey = "";
        for (String key : genresMap.keySet()) {
            if (genresMap.get(key) > maxCount) {
                maxCount = genresMap.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }

    private List<Music> getTopTwoMusics(String[] genres, int[] plays, List<String> orderedGenre) {
        List<Music> result = new ArrayList<>();
        for (String genre : orderedGenre) {
            List<Music> musicList = getMusicList(genres, plays, genre);
            sortMusicListDesc(musicList);
            result.add(musicList.get(0));
            if (musicList.size() > 1) {
                result.add(musicList.get(1));
            }
        }
        return result;
    }

    private List<Music> getMusicList(String[] genres, int[] plays, String genre) {
        List<Music> musicList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            if (genres[i].equals(genre)) {
                musicList.add(new Music(i, genre, plays[i]));
            }
        }
        return musicList;
    }

    private void sortMusicListDesc(List<Music> musicList) {
        Collections.sort(musicList, (m1, m2) -> m2.count - m1.count);
    }

}
