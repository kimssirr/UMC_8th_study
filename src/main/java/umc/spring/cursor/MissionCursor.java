package umc.spring.cursor;

public record MissionCursor(int missionPoints, Long missionId) {

    // 문자열 커서를 → 객체로 바꿔줌
    public static MissionCursor of(String rawCursor) {
        int point = Integer.parseInt(rawCursor.substring(0, 10));
        long id = Long.parseLong(rawCursor.substring(10));
        return new MissionCursor(point, id);
    }

    // 객체를 다시 문자열 커서로 바꿔줌
    public String toCursorString() {
        return String.format("%010d%010d", missionPoints, missionId);
    }
}
