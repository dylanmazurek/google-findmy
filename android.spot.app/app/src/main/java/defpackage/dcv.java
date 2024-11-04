package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcv extends dcu {
    public boolean j;
    private czw k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public dcv(cym cymVar, dcx dcxVar, List list, cyb cybVar) {
        super(cymVar, dcxVar);
        dcu dcuVar;
        dcu dcvVar;
        String str;
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        dbs dbsVar = dcxVar.q;
        if (dbsVar != null) {
            czw a = dbsVar.a();
            this.k = a;
            i(a);
            this.k.h(this);
        } else {
            this.k = null;
        }
        sl slVar = new sl(cybVar.g.size());
        int size = list.size() - 1;
        dcu dcuVar2 = null;
        while (true) {
            if (size >= 0) {
                dcx dcxVar2 = (dcx) list.get(size);
                int i = dcxVar2.t;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            switch (i) {
                                                case 1:
                                                    str = "PRE_COMP";
                                                    break;
                                                case 2:
                                                    str = "SOLID";
                                                    break;
                                                case 3:
                                                    str = "IMAGE";
                                                    break;
                                                case 4:
                                                    str = "NULL";
                                                    break;
                                                case 5:
                                                    str = "SHAPE";
                                                    break;
                                                case 6:
                                                    str = "TEXT";
                                                    break;
                                                default:
                                                    str = "UNKNOWN";
                                                    break;
                                            }
                                            deu.a("Unknown layer type ".concat(str));
                                            dcvVar = null;
                                        } else {
                                            dcvVar = new ddd(cymVar, dcxVar2);
                                        }
                                    } else {
                                        dcvVar = new dcz(cymVar, dcxVar2, this, cybVar);
                                    }
                                } else {
                                    dcvVar = new dcy(cymVar, dcxVar2);
                                }
                            } else {
                                dcvVar = new dcw(cymVar, dcxVar2);
                            }
                        } else {
                            dcvVar = new dda(cymVar, dcxVar2);
                        }
                    } else {
                        dcvVar = new dcv(cymVar, dcxVar2, (List) cybVar.a.get(dcxVar2.f), cybVar);
                    }
                    if (dcvVar != null) {
                        slVar.j(dcvVar.c.d, dcvVar);
                        if (dcuVar2 != null) {
                            dcuVar2.e = dcvVar;
                            dcuVar2 = null;
                        } else {
                            this.l.add(0, dcvVar);
                            int i3 = dcxVar2.u;
                            int i4 = i3 - 1;
                            if (i3 != 0) {
                                if (i4 == 1 || i4 == 2) {
                                    dcuVar2 = dcvVar;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    size--;
                } else {
                    throw null;
                }
            } else {
                for (int i5 = 0; i5 < slVar.b(); i5++) {
                    dcu dcuVar3 = (dcu) slVar.e(slVar.c(i5));
                    if (dcuVar3 != null && (dcuVar = (dcu) slVar.e(dcuVar3.c.e)) != null) {
                        dcuVar3.f = dcuVar;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.dcu, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.E) {
            if (dfeVar == null) {
                czw czwVar = this.k;
                if (czwVar != null) {
                    czwVar.k(null);
                    return;
                }
                return;
            }
            dan danVar = new dan(dfeVar);
            this.k = danVar;
            danVar.h(this);
            i(this.k);
        }
    }

    @Override // defpackage.dcu, defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
                ((dcu) this.l.get(size)).c(this.m, this.a, true);
                rectF.union(this.m);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dcu
    public final void j(Canvas canvas, Matrix matrix, int i) {
        dcx dcxVar = this.c;
        this.n.set(0.0f, 0.0f, dcxVar.n, dcxVar.o);
        matrix.mapRect(this.n);
        canvas.save();
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                if ((!this.j && "__container".equals(this.c.c)) || this.n.isEmpty() || canvas.clipRect(this.n)) {
                    ((dcu) this.l.get(size)).b(canvas, matrix, i);
                }
            } else {
                canvas.restore();
                cxw.a();
                return;
            }
        }
    }

    @Override // defpackage.dcu
    public final void l(dbm dbmVar, int i, List list, dbm dbmVar2) {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            ((dcu) this.l.get(i2)).e(dbmVar, i, list, dbmVar2);
        }
    }

    @Override // defpackage.dcu
    public final void m(float f) {
        super.m(f);
        if (this.k != null) {
            f = ((((Float) this.k.e()).floatValue() * this.c.b.k) - this.c.b.i) / (this.b.a.b() + 0.01f);
        }
        if (this.k == null) {
            dcx dcxVar = this.c;
            f -= dcxVar.m / dcxVar.b.b();
        }
        dcx dcxVar2 = this.c;
        if (dcxVar2.l != 0.0f && !"__container".equals(dcxVar2.c)) {
            f /= this.c.l;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((dcu) this.l.get(size)).m(f);
            } else {
                return;
            }
        }
    }
}
