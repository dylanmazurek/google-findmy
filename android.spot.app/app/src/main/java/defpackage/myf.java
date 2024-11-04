package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myf {
    public static final nbj a = new nbj("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final mwv c(myb mybVar, mnb mnbVar, int i) {
        if (i == 1) {
            return mybVar;
        }
        return new mzf(mybVar, mnbVar, 0, 2);
    }
}
