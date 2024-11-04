package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chb implements cfo {
    public final chg a;
    public boolean b = false;
    public final hzz c;

    public chb(chg chgVar, hzz hzzVar) {
        this.a = chgVar;
        this.c = hzzVar;
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        if (cgz.b(2)) {
            Objects.toString(this.a);
            chg.e(obj);
        }
        this.b = true;
        hzz hzzVar = this.c;
        hzzVar.a.clear();
        hzzVar.a.addAll((List) obj);
        hzzVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.c.toString();
    }
}
