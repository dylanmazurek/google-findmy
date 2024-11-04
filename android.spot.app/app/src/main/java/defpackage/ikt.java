package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikt implements ijv {
    private final /* synthetic */ int a;

    public ikt(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    public static final InputStream b(kqr kqrVar) {
        ijt ijtVar;
        InputStream c = kqrVar.e.c((Uri) kqrVar.c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        if (!kqrVar.d.isEmpty()) {
            ?? r2 = kqrVar.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                ilb a = ((ild) it.next()).a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                ijtVar = new ijt(c, arrayList2);
            } else {
                ijtVar = null;
            }
            if (ijtVar != null) {
                arrayList.add(ijtVar);
            }
        }
        for (ile ileVar : kqrVar.f) {
            arrayList.add(ileVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.ijv
    public final /* synthetic */ Object a(kqr kqrVar) {
        long j;
        String str;
        hwl hwlVar;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return b(kqrVar);
            }
            InputStream b = b(kqrVar);
            try {
                liq J = liq.J(b);
                hwo hwoVar = hwo.a;
                int k = J.k();
                if (k <= 1) {
                    J.k();
                    int e = J.e(J.n());
                    lja a = lja.a();
                    ljn l = hwp.e.l();
                    try {
                        try {
                            try {
                                llg b2 = lkz.a.b(l);
                                b2.l(l, lir.p(J), a);
                                b2.g(l);
                                ljn.A(l);
                                hwp hwpVar = (hwp) l;
                                J.A(e);
                                byte[] F = J.F();
                                hwk hwkVar = new hwk();
                                try {
                                    hwkVar.a.setInput(F);
                                    try {
                                        liq J2 = liq.J(new hwj(hwkVar));
                                        hwm hwmVar = hwm.a;
                                        int j2 = J2.j();
                                        if (j2 >= 0) {
                                            jjs jjsVar = new jjs(jmb.a);
                                            long j3 = 0;
                                            for (int i2 = 0; i2 < j2; i2++) {
                                                long r = J2.r();
                                                int i3 = (int) r;
                                                long j4 = r >>> 3;
                                                if (j4 == 0) {
                                                    j = 0;
                                                    str = J2.x();
                                                } else {
                                                    long j5 = j4 + j3;
                                                    if (j5 <= 2305843009213693951L) {
                                                        j = j5;
                                                        str = null;
                                                    } else {
                                                        throw new ljy("Flag name larger than max size");
                                                    }
                                                }
                                                int i4 = i3 & 7;
                                                if (i4 != 0 && i4 != 1) {
                                                    if (i4 != 2) {
                                                        if (i4 != 3) {
                                                            if (i4 != 4) {
                                                                if (i4 == 5) {
                                                                    hwlVar = new hwl(j, str, i4, 0L, J2.F());
                                                                } else {
                                                                    throw new ljy("Unrecognized flag type " + i4);
                                                                }
                                                            } else {
                                                                hwlVar = new hwl(j, str, i4, 0L, J2.x());
                                                            }
                                                        } else {
                                                            hwlVar = new hwl(j, str, i4, Double.doubleToRawLongBits(J2.b()), null);
                                                        }
                                                    } else {
                                                        hwlVar = new hwl(j, str, i4, J2.r(), null);
                                                    }
                                                } else {
                                                    hwlVar = new hwl(j, str, i4, 0L, null);
                                                }
                                                long j6 = hwlVar.a;
                                                if (j6 != 0) {
                                                    j3 = j6;
                                                }
                                                jjsVar.m(hwlVar);
                                            }
                                            hwm hwmVar2 = new hwm(jjsVar.g());
                                            hwkVar.close();
                                            hwo hwoVar2 = new hwo(hwmVar2, hwpVar);
                                            if (b != null) {
                                                b.close();
                                            }
                                            return hwoVar2;
                                        }
                                        throw new ljy("Negative number of flags");
                                    } finally {
                                        hwkVar.a.reset();
                                    }
                                } finally {
                                }
                            } catch (IOException e2) {
                                if (e2.getCause() instanceof ljy) {
                                    throw ((ljy) e2.getCause());
                                }
                                throw new ljy(e2);
                            } catch (RuntimeException e3) {
                                if (e3.getCause() instanceof ljy) {
                                    throw ((ljy) e3.getCause());
                                }
                                throw e3;
                            }
                        } catch (llo e4) {
                            throw e4.a();
                        }
                    } catch (ljy e5) {
                        if (e5.a) {
                            throw new ljy(e5);
                        }
                        throw e5;
                    }
                } else {
                    throw new ljy("Unsupported version: " + k + ". Current version is: 1");
                }
            } finally {
            }
        } else {
            iku ikuVar = new iku();
            ikuVar.b();
            File a2 = ikuVar.a(kqrVar);
            iqg.t(a2);
            return new RandomAccessFile(a2, "rw");
        }
    }
}
