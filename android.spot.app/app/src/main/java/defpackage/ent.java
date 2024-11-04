package defpackage;

import android.content.res.Resources;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ent implements Comparator {
    private final Resources a;

    public ent(Resources resources) {
        this.a = resources;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        eoe eoeVar = (eoe) obj;
        eoe eoeVar2 = (eoe) obj2;
        eoeVar.getClass();
        eoeVar2.getClass();
        if (amr.i(eoeVar, eoeVar2)) {
            return 0;
        }
        kyj kyjVar = eoeVar.a;
        kyj kyjVar2 = kyj.DEVICE_TYPE_BEACON;
        if (kyjVar == kyjVar2) {
            return 1;
        }
        if (eoeVar2.a == kyjVar2) {
            return -1;
        }
        Resources resources = this.a;
        int i = eoeVar.b;
        int i2 = eoeVar2.b;
        String string = resources.getString(i);
        String string2 = resources.getString(i2);
        string2.getClass();
        return string.compareTo(string2);
    }
}
