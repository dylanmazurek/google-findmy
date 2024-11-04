package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cza implements czb, czj, czr, dbn {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final cym g;
    private List h;
    private dam i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cza(defpackage.cym r8, defpackage.dcu r9, defpackage.dcp r10, defpackage.cyb r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            dcf r6 = (defpackage.dcf) r6
            cyz r6 = r6.a(r8, r11, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r11 = r10.size()
            if (r1 >= r11) goto L42
            java.lang.Object r11 = r10.get(r1)
            dcf r11 = (defpackage.dcf) r11
            boolean r0 = r11 instanceof defpackage.dcb
            if (r0 == 0) goto L3f
            dcb r11 = (defpackage.dcb) r11
            r6 = r11
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cza.<init>(cym, dcu, dcp, cyb):void");
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        dam damVar = this.i;
        if (damVar != null) {
            damVar.e(obj, dfeVar);
        }
    }

    @Override // defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        if (!this.f) {
            this.b.set(matrix);
            dam damVar = this.i;
            if (damVar != null) {
                this.b.preConcat(damVar.a());
                czw czwVar = this.i.e;
                if (czwVar == null) {
                    intValue = 100;
                } else {
                    intValue = ((Integer) czwVar.e()).intValue();
                }
                i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
            }
            int size = this.a.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Object obj = this.a.get(size);
                    if (obj instanceof czb) {
                        ((czb) obj).b(canvas, this.b, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.set(matrix);
        dam damVar = this.i;
        if (damVar != null) {
            this.b.preConcat(damVar.a());
        }
        this.d.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                cyz cyzVar = (cyz) this.a.get(size);
                if (cyzVar instanceof czb) {
                    ((czb) cyzVar).c(this.d, this.b, z);
                    rectF.union(this.d);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.czr
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        if (dbmVar.e(this.e, i) || "__container".equals(this.e)) {
            if (!"__container".equals(this.e)) {
                dbmVar2 = dbmVar2.b(this.e);
                if (dbmVar.d(this.e, i)) {
                    list.add(dbmVar2.c(this));
                }
            }
            if (dbmVar.f(this.e, i)) {
                int a = i + dbmVar.a(this.e, i);
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    cyz cyzVar = (cyz) this.a.get(i2);
                    if (cyzVar instanceof dbn) {
                        ((dbn) cyzVar).e(dbmVar, a, list, dbmVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.a.size());
        arrayList.addAll(list);
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                cyz cyzVar = (cyz) this.a.get(size);
                cyzVar.f(arrayList, this.a.subList(0, size));
                arrayList.add(cyzVar);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix h() {
        dam damVar = this.i;
        if (damVar != null) {
            return damVar.a();
        }
        this.b.reset();
        return this.b;
    }

    @Override // defpackage.czj
    public final Path i() {
        this.b.reset();
        dam damVar = this.i;
        if (damVar != null) {
            this.b.set(damVar.a());
        }
        this.c.reset();
        if (!this.f) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                cyz cyzVar = (cyz) this.a.get(size);
                if (cyzVar instanceof czj) {
                    this.c.addPath(((czj) cyzVar).i(), this.b);
                }
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.a.size(); i++) {
                cyz cyzVar = (cyz) this.a.get(i);
                if (cyzVar instanceof czj) {
                    this.h.add((czj) cyzVar);
                }
            }
        }
        return this.h;
    }

    public cza(cym cymVar, dcu dcuVar, String str, boolean z, List list, dcb dcbVar) {
        new cyx();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = cymVar;
        this.f = z;
        this.a = list;
        if (dcbVar != null) {
            dam damVar = new dam(dcbVar);
            this.i = damVar;
            damVar.c(dcuVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            cyz cyzVar = (cyz) list.get(size);
            if (cyzVar instanceof czg) {
                arrayList.add((czg) cyzVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((czg) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
