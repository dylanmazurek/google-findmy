package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v {
    public static final v FULL;
    public static final v FULL_STANDALONE;
    public static final v NARROW;
    public static final v NARROW_STANDALONE;
    public static final v SHORT;
    public static final v SHORT_STANDALONE;
    private static final /* synthetic */ v[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [j$.time.format.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [j$.time.format.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [j$.time.format.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.time.format.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.time.format.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.format.v, java.lang.Enum] */
    static {
        ?? r6 = new Enum("FULL", 0);
        FULL = r6;
        ?? r7 = new Enum("FULL_STANDALONE", 1);
        FULL_STANDALONE = r7;
        ?? r8 = new Enum("SHORT", 2);
        SHORT = r8;
        ?? r9 = new Enum("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = r9;
        ?? r10 = new Enum("NARROW", 4);
        NARROW = r10;
        ?? r11 = new Enum("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = r11;
        a = new v[]{r6, r7, r8, r9, r10, r11};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }
}
