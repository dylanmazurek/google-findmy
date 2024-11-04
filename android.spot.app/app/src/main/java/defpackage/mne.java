package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mne {
    public static final mne a;
    public static final mne b;
    public static final mne c;
    private static final /* synthetic */ mne[] d;

    static {
        mne mneVar = new mne("COROUTINE_SUSPENDED", 0);
        a = mneVar;
        mne mneVar2 = new mne("UNDECIDED", 1);
        b = mneVar2;
        mne mneVar3 = new mne("RESUMED", 2);
        c = mneVar3;
        mne[] mneVarArr = {mneVar, mneVar2, mneVar3};
        d = mneVarArr;
        mjo.t(mneVarArr);
    }

    private mne(String str, int i) {
    }

    public static mne[] values() {
        return (mne[]) d.clone();
    }
}
