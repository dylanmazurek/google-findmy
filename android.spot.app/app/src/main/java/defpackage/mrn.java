package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrn {
    public static final mrn a;
    public static final mrn b;
    public static final mrn c;
    public static final mrn d;
    public static final mrn e;
    public static final mrn f;
    public static final mrn g;
    private static final /* synthetic */ mrn[] i;
    public final TimeUnit h;

    static {
        mrn mrnVar = new mrn("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = mrnVar;
        mrn mrnVar2 = new mrn("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = mrnVar2;
        mrn mrnVar3 = new mrn("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = mrnVar3;
        mrn mrnVar4 = new mrn("SECONDS", 3, TimeUnit.SECONDS);
        d = mrnVar4;
        mrn mrnVar5 = new mrn("MINUTES", 4, TimeUnit.MINUTES);
        e = mrnVar5;
        mrn mrnVar6 = new mrn("HOURS", 5, TimeUnit.HOURS);
        f = mrnVar6;
        mrn mrnVar7 = new mrn("DAYS", 6, TimeUnit.DAYS);
        g = mrnVar7;
        mrn[] mrnVarArr = {mrnVar, mrnVar2, mrnVar3, mrnVar4, mrnVar5, mrnVar6, mrnVar7};
        i = mrnVarArr;
        mjo.t(mrnVarArr);
    }

    private mrn(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static mrn[] values() {
        return (mrn[]) i.clone();
    }
}
