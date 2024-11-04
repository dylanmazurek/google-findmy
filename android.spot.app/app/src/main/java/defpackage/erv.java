package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erv {
    public static final erv a;
    public static final erv b;
    public static final erv c;
    public static final erv d;
    private static final /* synthetic */ erv[] e;

    static {
        erv ervVar = new erv("FOUND", 0);
        a = ervVar;
        erv ervVar2 = new erv("WITH_BEARING", 1);
        b = ervVar2;
        erv ervVar3 = new erv("CONNECTED_WITHOUT_BEARING", 2);
        c = ervVar3;
        erv ervVar4 = new erv("DISCONNECTED", 3);
        d = ervVar4;
        erv[] ervVarArr = {ervVar, ervVar2, ervVar3, ervVar4};
        e = ervVarArr;
        mjo.t(ervVarArr);
    }

    private erv(String str, int i) {
    }

    public static erv[] values() {
        return (erv[]) e.clone();
    }
}
