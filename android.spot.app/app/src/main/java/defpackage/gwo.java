package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwo {
    public static final gwo a;
    public static final gwo b;
    private static final /* synthetic */ gwo[] d;
    public final int c;

    static {
        gwo gwoVar = new gwo("SYSTEM_TRAY", 0, 1);
        a = gwoVar;
        gwo gwoVar2 = new gwo("IN_APP", 1, 2);
        b = gwoVar2;
        gwo[] gwoVarArr = {gwoVar, gwoVar2};
        d = gwoVarArr;
        mjo.t(gwoVarArr);
    }

    private gwo(String str, int i, int i2) {
        this.c = i2;
    }

    public static gwo[] values() {
        return (gwo[]) d.clone();
    }
}
