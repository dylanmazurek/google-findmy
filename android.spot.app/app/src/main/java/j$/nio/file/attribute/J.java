package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements v {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    private /* synthetic */ J(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        this.a = userDefinedFileAttributeView;
    }

    public static /* synthetic */ J c(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        if (userDefinedFileAttributeView == null) {
            return null;
        }
        if (!(userDefinedFileAttributeView instanceof K)) {
            return new J(userDefinedFileAttributeView);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.v
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }
}
