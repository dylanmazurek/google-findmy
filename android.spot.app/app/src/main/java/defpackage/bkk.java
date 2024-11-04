package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkk {
    public static final bkk a = new bkk();

    private bkk() {
    }

    public final Object a(bjy bjyVar) {
        ArrayList arrayList = new ArrayList(mkm.ap(bjyVar));
        Iterator<E> it = bjyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bjx) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(bke bkeVar, bjy bjyVar) {
        ArrayList arrayList = new ArrayList(mkm.ap(bjyVar));
        Iterator<E> it = bjyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bjx) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        bkeVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
