package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mza {
    private int a;
    private mzz b;
    public mzc[] d;
    public int e;

    public final mys b() {
        mzz mzzVar;
        synchronized (this) {
            mzzVar = this.b;
            if (mzzVar == null) {
                mzzVar = new mzz(this.e);
                this.b = mzzVar;
            }
        }
        return mzzVar;
    }

    protected abstract mzc h();

    protected abstract mzc[] k();

    /* JADX INFO: Access modifiers changed from: protected */
    public final mzc l() {
        mzc mzcVar;
        mzz mzzVar;
        synchronized (this) {
            mzc[] mzcVarArr = this.d;
            if (mzcVarArr == null) {
                mzcVarArr = k();
                this.d = mzcVarArr;
            } else {
                int i = this.e;
                int length = mzcVarArr.length;
                if (i >= length) {
                    Object[] copyOf = Arrays.copyOf(mzcVarArr, length + length);
                    copyOf.getClass();
                    mzcVarArr = (mzc[]) copyOf;
                    this.d = mzcVarArr;
                }
            }
            int i2 = this.a;
            do {
                mzcVar = mzcVarArr[i2];
                if (mzcVar == null) {
                    mzcVar = h();
                    mzcVarArr[i2] = mzcVar;
                }
                i2++;
                if (i2 >= mzcVarArr.length) {
                    i2 = 0;
                }
            } while (!mzcVar.a(this));
            this.a = i2;
            this.e++;
            mzzVar = this.b;
        }
        if (mzzVar != null) {
            mzzVar.n(1);
        }
        return mzcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(mzc mzcVar) {
        mzz mzzVar;
        int i;
        mmx[] b;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            mzzVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            mzcVar.getClass();
            b = mzcVar.b(this);
        }
        for (mmx mmxVar : b) {
            if (mmxVar != null) {
                mmxVar.p(mlh.a);
            }
        }
        if (mzzVar != null) {
            mzzVar.n(-1);
        }
    }
}
