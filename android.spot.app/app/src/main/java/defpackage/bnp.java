package defpackage;

import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnp {
    public static int a;
    public Object b;
    public final Object c;

    public bnp() {
        this.c = new aiu(new ayr[16]);
    }

    public final long a(bnj bnjVar, long j) {
        bns bnsVar = bnjVar.d;
        if (bnsVar instanceof bnn) {
            return j;
        }
        int size = bnjVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            bnh bnhVar = (bnh) bnjVar.j.get(i);
            if (bnhVar instanceof bnj) {
                bnj bnjVar2 = (bnj) bnhVar;
                if (bnjVar2.d != bnsVar) {
                    j2 = Math.min(j2, a(bnjVar2, bnjVar2.e + j));
                }
            }
        }
        if (bnjVar == bnsVar.j) {
            long a2 = j - bnsVar.a();
            return Math.min(Math.min(j2, a(bnsVar.i, a2)), a2 - bnsVar.i.e);
        }
        return j2;
    }

    public final long b(bnj bnjVar, long j) {
        bns bnsVar = bnjVar.d;
        if (bnsVar instanceof bnn) {
            return j;
        }
        int size = bnjVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            bnh bnhVar = (bnh) bnjVar.j.get(i);
            if (bnhVar instanceof bnj) {
                bnj bnjVar2 = (bnj) bnhVar;
                if (bnjVar2.d != bnsVar) {
                    j2 = Math.max(j2, b(bnjVar2, bnjVar2.e + j));
                }
            }
        }
        if (bnjVar == bnsVar.i) {
            long a2 = j + bnsVar.a();
            return Math.max(Math.max(j2, b(bnsVar.j, a2)), a2 - bnsVar.j.e);
        }
        return j2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.textclassifier.TextClassifier, java.lang.Object] */
    public final TextClassifier c() {
        ?? r0 = this.b;
        if (r0 == 0) {
            return iv.a((TextView) this.c);
        }
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void d(ayr ayrVar) {
        int i = 0;
        if (ayrVar.ah() == 5 && !ayrVar.Z() && !ayrVar.ac() && !ayrVar.r && ayrVar.d()) {
            azh azhVar = ayrVar.n;
            if ((azhVar.a() & 256) != 0) {
                for (aow aowVar = azhVar.e; aowVar != null; aowVar = aowVar.o) {
                    if ((aowVar.l & 256) != 0) {
                        axx axxVar = aowVar;
                        ?? r6 = 0;
                        while (axxVar != 0) {
                            if (axxVar instanceof ayc) {
                                ayc aycVar = (ayc) axxVar;
                                aycVar.c(qg.g(aycVar, 256));
                            } else if ((axxVar.l & 256) != 0 && (axxVar instanceof axx)) {
                                aow aowVar2 = axxVar.d;
                                int i2 = 0;
                                axxVar = axxVar;
                                r6 = r6;
                                while (aowVar2 != null) {
                                    if ((aowVar2.l & 256) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            axxVar = aowVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new aiu(new aow[16]);
                                            }
                                            if (axxVar != 0) {
                                                r6.o(axxVar);
                                            }
                                            r6.o(aowVar2);
                                            axxVar = 0;
                                        }
                                    }
                                    aowVar2 = aowVar2.o;
                                    axxVar = axxVar;
                                    r6 = r6;
                                }
                                if (i2 != 1) {
                                }
                            }
                            axxVar = qg.d(r6);
                        }
                    }
                    if ((aowVar.m & 256) == 0) {
                        break;
                    }
                }
            }
        }
        ayrVar.q = false;
        aiu n = ayrVar.n();
        int i3 = n.b;
        if (i3 > 0) {
            Object[] objArr = n.a;
            do {
                d((ayr) objArr[i]);
                i++;
            } while (i < i3);
        }
    }

    public final void e(ayr ayrVar) {
        ((aiu) this.c).o(ayrVar);
        ayrVar.q = true;
    }

    public bnp(TextView textView) {
        this.c = textView;
    }

    public bnp(bns bnsVar) {
        this.b = null;
        this.c = new ArrayList();
        a++;
        this.b = bnsVar;
    }
}
