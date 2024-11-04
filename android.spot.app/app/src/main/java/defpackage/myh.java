package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class myh {
    public static final myh a;
    public static final myh b;
    public static final myh c;
    private static final /* synthetic */ myh[] d;

    static {
        myh myhVar = new myh("START", 0);
        a = myhVar;
        myh myhVar2 = new myh("STOP", 1);
        b = myhVar2;
        myh myhVar3 = new myh("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = myhVar3;
        myh[] myhVarArr = {myhVar, myhVar2, myhVar3};
        d = myhVarArr;
        mjo.t(myhVarArr);
    }

    private myh(String str, int i) {
    }

    public static myh[] values() {
        return (myh[]) d.clone();
    }
}
