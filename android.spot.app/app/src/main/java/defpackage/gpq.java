package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpq {
    public static final gpq a;
    public static final gpq b;
    public static final gpq c;
    private static final /* synthetic */ gpq[] d;

    static {
        gpq gpqVar = new gpq("CLEARTEXT", 0);
        a = gpqVar;
        gpq gpqVar2 = new gpq("ENCRYPTED", 1);
        b = gpqVar2;
        gpq gpqVar3 = new gpq("PLACEHOLDER", 2);
        c = gpqVar3;
        gpq[] gpqVarArr = {gpqVar, gpqVar2, gpqVar3};
        d = gpqVarArr;
        mjo.t(gpqVarArr);
    }

    private gpq(String str, int i) {
    }

    public static gpq[] values() {
        return (gpq[]) d.clone();
    }
}
