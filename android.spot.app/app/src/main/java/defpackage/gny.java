package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gny {
    public static final gny a;
    public static final gny b;
    public static final gny c;
    private static final /* synthetic */ gny[] d;

    static {
        gny gnyVar = new gny("FCM", 0);
        a = gnyVar;
        gny gnyVar2 = new gny("FCM_AND_FETCH", 1);
        b = gnyVar2;
        gny gnyVar3 = new gny("FETCH_ONLY", 2);
        c = gnyVar3;
        gny[] gnyVarArr = {gnyVar, gnyVar2, gnyVar3};
        d = gnyVarArr;
        mjo.t(gnyVarArr);
    }

    private gny(String str, int i) {
    }

    public static gny[] values() {
        return (gny[]) d.clone();
    }

    public final boolean a() {
        if (this != a && this != b) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this != c && this != b) {
            return false;
        }
        return true;
    }
}
