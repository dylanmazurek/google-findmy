package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byh implements AccessibilityManager.TouchExplorationStateChangeListener {
    final njz a;

    public byh(njz njzVar) {
        this.a = njzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byh)) {
            return false;
        }
        return this.a.equals(((byh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        ixq ixqVar = (ixq) this.a.a;
        AutoCompleteTextView autoCompleteTextView = ixqVar.a;
        if (autoCompleteTextView != null && !ivc.l(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = ixqVar.h;
            int i = 1;
            if (true == z) {
                i = 2;
            }
            checkableImageButton.setImportantForAccessibility(i);
        }
    }
}
