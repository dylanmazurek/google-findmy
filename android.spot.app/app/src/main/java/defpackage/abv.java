package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abv implements afp {
    public sy b;
    private final Set c;
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    public final List a = new ArrayList();
    private final List f = new ArrayList();
    private final sc g = new sc((byte[]) null);
    private final sc h = new sc((byte[]) null);

    public abv(Set set) {
        this.c = set;
    }

    private final void e(int i) {
        if (!this.f.isEmpty()) {
            int i2 = 0;
            List list = null;
            sc scVar = null;
            sc scVar2 = null;
            int i3 = 0;
            while (true) {
                sc scVar3 = this.h;
                if (i3 >= scVar3.b) {
                    break;
                }
                if (i <= scVar3.a(i3)) {
                    Object remove = this.f.remove(i3);
                    int b = this.h.b(i3);
                    int b2 = this.g.b(i3);
                    if (list == null) {
                        list = mkm.Q(remove);
                        scVar2 = new sc((byte[]) null);
                        scVar2.d(b);
                        scVar = new sc((byte[]) null);
                        scVar.d(b2);
                    } else {
                        scVar.getClass();
                        scVar2.getClass();
                        list.add(remove);
                        scVar2.d(b);
                        scVar.d(b2);
                    }
                } else {
                    i3++;
                }
            }
            if (list != null) {
                scVar.getClass();
                scVar2.getClass();
                int size = list.size() - 1;
                while (i2 < size) {
                    int i4 = i2 + 1;
                    int size2 = list.size();
                    for (int i5 = i4; i5 < size2; i5++) {
                        int a = scVar2.a(i2);
                        int a2 = scVar2.a(i5);
                        if (a < a2 || (a2 == a && scVar.a(i2) < scVar.a(i5))) {
                            Object obj = list.get(i2);
                            list.set(i2, list.get(i5));
                            list.set(i5, obj);
                            abx.a(scVar, i2, i5);
                            abx.a(scVar2, i2, i5);
                        }
                    }
                    i2 = i4;
                }
                this.e.addAll(list);
            }
        }
    }

    public final void a() {
        if (!this.c.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    afq afqVar = (afq) it.next();
                    it.remove();
                    afqVar.h();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void b() {
        e(Integer.MIN_VALUE);
        if (!this.e.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                sy syVar = this.b;
                int size = this.e.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = this.e.get(size);
                    if (obj instanceof afq) {
                        this.c.remove(obj);
                        ((afq) obj).i();
                    }
                    if (obj instanceof abe) {
                        if (syVar != null && syVar.a(obj)) {
                            ((abe) obj).b();
                        } else {
                            ((abe) obj).a();
                        }
                    }
                }
            } finally {
            }
        }
        if (!this.d.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                List list = this.d;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    afq afqVar = (afq) list.get(i);
                    this.c.remove(afqVar);
                    afqVar.c();
                }
            } finally {
            }
        }
    }

    public final void c(Object obj, int i, int i2, int i3) {
        e(i);
        if (i3 >= 0 && i3 < i) {
            this.f.add(obj);
            this.g.d(i2);
            this.h.d(i3);
            return;
        }
        this.e.add(obj);
    }

    @Override // defpackage.afp
    public final void d(afq afqVar) {
        this.d.add(afqVar);
    }
}
