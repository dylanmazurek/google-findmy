package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bnj implements bnh {
    final bns d;
    int e;
    public int f;
    public bnh a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    bnk h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public bnj(bns bnsVar) {
        this.d = bnsVar;
    }

    public final void a(bnh bnhVar) {
        this.j.add(bnhVar);
        if (this.i) {
            bnhVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (!this.i) {
            this.i = true;
            this.f = i;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((bnh) it.next()).f();
            }
        }
    }

    @Override // defpackage.bnh
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((bnj) it.next()).i) {
                return;
            }
        }
        this.c = true;
        bnh bnhVar = this.a;
        if (bnhVar != null) {
            bnhVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        bnj bnjVar = null;
        for (bnj bnjVar2 : this.k) {
            if (!(bnjVar2 instanceof bnk)) {
                i++;
                bnjVar = bnjVar2;
            }
        }
        if (bnjVar != null && i == 1 && bnjVar.i) {
            bnk bnkVar = this.h;
            if (bnkVar != null) {
                if (bnkVar.i) {
                    this.e = this.g * bnkVar.f;
                } else {
                    return;
                }
            }
            c(bnjVar.f + this.e);
        }
        bnh bnhVar2 = this.a;
        if (bnhVar2 != null) {
            bnhVar2.f();
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.aj);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        if (this.i) {
            obj = Integer.valueOf(this.f);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
