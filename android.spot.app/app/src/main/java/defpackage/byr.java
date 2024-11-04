package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byr {
    public final AccessibilityRecord a;

    @Deprecated
    public byr(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byr)) {
            return false;
        }
        byr byrVar = (byr) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            if (byrVar.a == null) {
                return true;
            }
            return false;
        }
        return accessibilityRecord.equals(byrVar.a);
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
