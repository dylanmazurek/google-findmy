package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    public static final c STANDARD;
    public static final c UTC;
    public static final c WALL;
    private static final /* synthetic */ c[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.zone.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.time.zone.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.zone.c] */
    static {
        ?? r3 = new Enum("UTC", 0);
        UTC = r3;
        ?? r4 = new Enum("WALL", 1);
        WALL = r4;
        ?? r5 = new Enum("STANDARD", 2);
        STANDARD = r5;
        a = new c[]{r3, r4, r5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) a.clone();
    }
}
