package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjg extends cji {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public cjg(ckd ckdVar, String str) {
        super(ckdVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0];
    }

    private final Cursor n() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        bzb.a(21, "no row");
        throw new mks();
    }

    private final void o(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            copyOf.getClass();
            this.a = copyOf;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.e;
                        if (bArr.length < i3) {
                            Object[] copyOf2 = Arrays.copyOf(bArr, i3);
                            copyOf2.getClass();
                            this.e = (byte[][]) copyOf2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.d;
                if (strArr.length < i3) {
                    Object[] copyOf3 = Arrays.copyOf(strArr, i3);
                    copyOf3.getClass();
                    this.d = (String[]) copyOf3;
                    return;
                }
                return;
            }
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] copyOf4 = Arrays.copyOf(dArr, i3);
                copyOf4.getClass();
                this.c = copyOf4;
                return;
            }
            return;
        }
        long[] jArr = this.b;
        if (jArr.length < i3) {
            long[] copyOf5 = Arrays.copyOf(jArr, i3);
            copyOf5.getClass();
            this.b = copyOf5;
        }
    }

    private final void p() {
        if (this.i == null) {
            this.i = this.f.a(new cjf(this));
        }
    }

    private static final void q(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        bzb.a(25, "column index out of range");
        throw new mks();
    }

    @Override // defpackage.ckb
    public final int a() {
        l();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.ckb
    public final long b(int i) {
        l();
        Cursor n = n();
        q(n, i);
        return n.getLong(i);
    }

    @Override // defpackage.ckb
    public final String c(int i) {
        l();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            q(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ckb
    public final String d(int i) {
        l();
        Cursor n = n();
        q(n, i);
        String string = n.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ckb
    public final void e(int i, long j) {
        l();
        o(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.ckb
    public final void f(int i) {
        l();
        o(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.ckb
    public final void g(int i, String str) {
        l();
        o(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.ckb
    public final void h() {
        if (!this.h) {
            l();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0];
            i();
        }
        m();
    }

    @Override // defpackage.ckb
    public final void i() {
        l();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.ckb
    public final boolean j(int i) {
        l();
        Cursor n = n();
        q(n, i);
        return n.isNull(i);
    }

    @Override // defpackage.ckb
    public final boolean k() {
        l();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
