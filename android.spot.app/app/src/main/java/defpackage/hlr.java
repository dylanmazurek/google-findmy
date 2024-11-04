package defpackage;

import android.content.res.ColorStateList;
import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hlr extends Property {
    public hlr(Class cls) {
        super(cls, "elevationProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExpandableDialogView) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        float floatValue = ((Float) obj2).floatValue();
        expandableDialogView.g = floatValue;
        float f = floatValue * expandableDialogView.f;
        expandableDialogView.e.K(f);
        expandableDialogView.e.L(ColorStateList.valueOf(expandableDialogView.c(f)));
        bwb.l(expandableDialogView.d, f);
        expandableDialogView.invalidate();
    }
}
