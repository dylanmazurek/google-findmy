package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czo implements czj, czr {
    private final boolean b;
    private final cym c;
    private final dai d;
    private boolean e;
    private final Path a = new Path();
    private final bet f = new bet((char[]) null);

    public czo(cym cymVar, dcu dcuVar, dcq dcqVar) {
        this.b = dcqVar.b;
        this.c = cymVar;
        dai a = dcqVar.a.a();
        this.d = a;
        dcuVar.i(a);
        a.h(this);
    }

    @Override // defpackage.czr
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            cyz cyzVar = (cyz) list.get(i);
            if (cyzVar instanceof czq) {
                czq czqVar = (czq) cyzVar;
                if (czqVar.e == 1) {
                    this.f.m(czqVar);
                    czqVar.a(this);
                }
            }
            if (cyzVar instanceof czn) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((czn) cyzVar);
            }
        }
        this.d.e = arrayList;
    }

    @Override // defpackage.cyz
    public final String g() {
        throw null;
    }

    @Override // defpackage.czj
    public final Path i() {
        if (!this.e) {
            this.a.reset();
            if (this.b) {
                this.e = true;
                return this.a;
            }
            Path path = (Path) this.d.e();
            if (path != null) {
                this.a.set(path);
                this.a.setFillType(Path.FillType.EVEN_ODD);
                this.f.n(this.a);
                this.e = true;
                return this.a;
            }
        }
        return this.a;
    }
}
