package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqu extends jqv {
    private final jqt c;

    public jqu(jos josVar, int i, jqt jqtVar) {
        super(josVar, i);
        char c;
        this.c = jqtVar;
        StringBuilder sb = new StringBuilder("%");
        josVar.f(sb);
        if (true != josVar.d()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(jqtVar.G);
    }

    @Override // defpackage.jqv
    public final void a(jqz jqzVar, Object obj) {
        char c;
        jqt jqtVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            jqz.c(jqzVar.d, obj, "%t" + jqtVar.G);
            return;
        }
        jos josVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        josVar.f(sb);
        if (true != josVar.d()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(jqtVar.G);
        jqzVar.d.append(String.format(joy.a, sb.toString(), obj));
    }
}
