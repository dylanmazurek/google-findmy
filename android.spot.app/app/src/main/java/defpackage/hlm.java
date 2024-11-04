package defpackage;

import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlm extends Property {
    public hlm(Class cls) {
        super(cls, "scrollOffset");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = ExpandableDialogView.m;
        return Integer.valueOf(((ExpandableDialogView) obj).i);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        int i = ExpandableDialogView.m;
        ((ExpandableDialogView) obj).i(intValue);
    }
}
