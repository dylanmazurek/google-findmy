package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mcv implements mju {
    public abstract mcu b();

    @Override // defpackage.mju
    public boolean o() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract mhm p();

    @Override // defpackage.mju
    public final void r() {
        mhm p;
        ktf ktfVar;
        if (!p().f && (ktfVar = (p = p()).j) != null && ktfVar.b() > 0) {
            p.b(false, true);
        }
    }

    @Override // defpackage.mju
    public final void s() {
        mcu b = b();
        mhi mhiVar = b.c;
        mhiVar.a = b;
        b.m = mhiVar;
    }

    @Override // defpackage.mju
    public final void t(int i) {
        mcu b = b();
        mhi mhiVar = b.m;
        int i2 = mkl.a;
        bth bthVar = new bth(b, i, 8, null);
        synchronized (((mfk) b).s) {
            bthVar.run();
        }
    }

    @Override // defpackage.mju
    public final void u(lzb lzbVar) {
        p().b = lzbVar;
    }

    @Override // defpackage.mju
    public final void v(InputStream inputStream) {
        int a;
        try {
            if (!p().f) {
                mhm p = p();
                if (!p.f) {
                    p.g++;
                    p.h++;
                    p.i = 0L;
                    mjt.b(p.e);
                    lzb lzbVar = p.b;
                    lza lzaVar = lyz.a;
                    try {
                        try {
                            int available = inputStream.available();
                            int i = 0;
                            if (available != 0 && lzbVar != lzaVar) {
                                mhj mhjVar = new mhj();
                                try {
                                    a = mhm.a(inputStream, mhjVar);
                                    mhjVar.close();
                                    int i2 = p.a;
                                    if (i2 >= 0 && a > i2) {
                                        throw new mcc(mca.f.d(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(p.a))));
                                    }
                                    p.c(mhjVar, true);
                                } catch (Throwable th) {
                                    mhjVar.close();
                                    throw th;
                                }
                            } else if (available != -1) {
                                p.i = available;
                                int i3 = p.a;
                                if (i3 >= 0 && available > i3) {
                                    throw new mcc(mca.f.d(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(available), Integer.valueOf(p.a))));
                                }
                                p.d.clear();
                                p.d.put((byte) 0).putInt(available);
                                if (p.j == null) {
                                    p.j = mjo.I(p.d.position() + available);
                                }
                                p.d(p.d.array(), 0, p.d.position());
                                a = mhm.a(inputStream, p.c);
                            } else {
                                mhj mhjVar2 = new mhj();
                                a = mhm.a(inputStream, mhjVar2);
                                p.c(mhjVar2, false);
                            }
                            if (available != -1 && a != available) {
                                throw new mcc(mca.h.d(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))));
                            }
                            mjt.b(p.e);
                            mjt mjtVar = p.e;
                            long j = p.i;
                            while (true) {
                                mjo[] mjoVarArr = mjtVar.b;
                                if (i >= mjoVarArr.length) {
                                    break;
                                }
                                mjoVarArr[i].d(j);
                                i++;
                            }
                            mjt.b(p.e);
                        } catch (IOException e) {
                            throw new mcc(mca.h.d("Failed to frame message").c(e));
                        } catch (RuntimeException e2) {
                            throw new mcc(mca.h.d("Failed to frame message").c(e2));
                        }
                    } catch (mcc e3) {
                        throw e3;
                    }
                } else {
                    throw new IllegalStateException("Framer already closed");
                }
            }
        } finally {
            mfh.f(inputStream);
        }
    }
}
