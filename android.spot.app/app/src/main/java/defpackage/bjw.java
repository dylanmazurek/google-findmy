package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjw implements bjz {
    private LocaleList a;
    private bjy b;
    private final rm c = new rm();

    @Override // defpackage.bjz
    public final bjy a() {
        LocaleList localeList;
        int size;
        Locale locale;
        rm rmVar = this.c;
        localeList = LocaleList.getDefault();
        synchronized (rmVar) {
            bjy bjyVar = this.b;
            if (bjyVar == null || localeList != this.a) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    locale = localeList.get(i);
                    arrayList.add(new bjx(locale));
                }
                bjy bjyVar2 = new bjy(arrayList);
                this.a = localeList;
                this.b = bjyVar2;
                return bjyVar2;
            }
            return bjyVar;
        }
    }
}
